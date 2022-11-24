package com.assessement.service2;

import com.assessement.service2.ReactorService2Grpc;
import com.assessement.service2.Service2OuterClass;
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
    private ReactorService2Grpc.ReactorService2Stub service;

    @Test
    @DirtiesContext
    public void shouldPassIfGrpcOK() {
        Service2OuterClass.NoParams request = Service2OuterClass.NoParams.newBuilder().build();
        Mono<Service2OuterClass.Service2Reply> response = service.getService2(request);
        Service2OuterClass.Service2Reply expected = Service2OuterClass.Service2Reply.newBuilder().
                setReply("Hello from service 2").
                build();
        Assertions.assertEquals(expected, response.block());
    }

}
