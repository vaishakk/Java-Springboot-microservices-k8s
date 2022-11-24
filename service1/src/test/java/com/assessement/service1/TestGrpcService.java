package com.assessement.service1;

import net.devh.boot.grpc.client.inject.GrpcClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import reactor.core.publisher.Mono;


@SpringBootTest(properties = {
        "grpc.server.inProcessName=test",
        "grpc.server.port=-1",
        "grpc.client.inProcess.address=in-process:test"
})
@SpringJUnitConfig(classes = { ServiceTestConfig.class })
@DirtiesContext
public class TestGrpcService {

    @GrpcClient("inProcess")
    private ReactorService1Grpc.ReactorService1Stub service;

    @Test
    @DirtiesContext
    public void shouldPassIfGrpcOK() {
        Service1OuterClass.NoParams request = Service1OuterClass.NoParams.newBuilder().build();
        Mono<Service1OuterClass.Service1Reply> response = service.getService1(request);
        Service1OuterClass.Service1Reply expected = Service1OuterClass.Service1Reply.newBuilder().
                setReply("Hello from service 1").
                build();
        Assertions.assertEquals(expected, response.block());
    }

}
