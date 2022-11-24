package com.assessement.gw;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.CreateContainerResponse;
import com.github.dockerjava.api.command.WaitContainerResultCallback;
import com.github.dockerjava.core.DockerClientBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.junit.jupiter.api.Assertions;

public class TestIntegration{
    static DockerClient dockerClient = DockerClientBuilder.getInstance().build();
    static TestRestTemplate testRestTemplate = new TestRestTemplate();

    public static String createContainer(String image, int hostPort, int contPort){
        CreateContainerResponse container = dockerClient.createContainerCmd(image)
                .withPortSpecs(hostPort + ":" + contPort)
                .exec()
                ;
        dockerClient.startContainerCmd(container.getId()).exec();
        return container.getId();
    }
    @Test
    public static void testIntegration() throws InterruptedException {
        String containerId1 = createContainer("service1:0.1", 9090, 9090);
        String containerId2 = createContainer("service2:0.1", 9091, 9090);
        String containerIdGw = createContainer("gwservice:0.1", 8080, 8080);
        WaitContainerResultCallback callback = new WaitContainerResultCallback();
        dockerClient.waitContainerCmd(containerId1).exec(callback);
        callback.awaitStarted();
        dockerClient.waitContainerCmd(containerId2).exec(callback);
        callback.awaitStarted();
        dockerClient.waitContainerCmd(containerIdGw).exec(callback);
        callback.awaitStarted();
        String response = testRestTemplate.getForObject("http://localhost:8080/service1", String.class);
        System.out.println("Response:" + response);
        Assertions.assertEquals("Hello from service 1", response);
    }
}
