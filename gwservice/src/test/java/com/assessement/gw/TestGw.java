package com.assessement.gw;

import com.assessement.service1.ReactorService1Grpc;
import com.assessement.service1.Service1OuterClass;
import com.assessement.service2.ReactorService2Grpc;
import com.assessement.service2.Service2OuterClass;
import io.grpc.ManagedChannel;
import io.grpc.inprocess.InProcessChannelBuilder;
import io.grpc.inprocess.InProcessServerBuilder;
import io.grpc.testing.GrpcCleanupRule;
import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import reactor.core.publisher.Mono;
import static org.mockito.AdditionalAnswers.delegatesTo;
import static org.mockito.Mockito.mock;

public class TestGw {

    @Rule
    public final GrpcCleanupRule grpcCleanup = new GrpcCleanupRule();
    private ManagedChannel channel1;
    private ManagedChannel channel2;
    private GrpcClient client;
    private final ReactorService1Grpc.Service1ImplBase service1Impl =
            mock(ReactorService1Grpc.Service1ImplBase.class, delegatesTo(
                    new ReactorService1Grpc.Service1ImplBase() {
                        @Override
                        public Mono<Service1OuterClass.Service1Reply> getService1(Mono<Service1OuterClass.NoParams> request){
                            return Mono.just(
                                    Service1OuterClass.Service1Reply
                                            .newBuilder()
                                            .setReply("Hello from service 1")
                                            .build());

                        }

                    }));
    private final ReactorService2Grpc.Service2ImplBase service2Impl =
            mock(ReactorService2Grpc.Service2ImplBase.class, delegatesTo(
                    new ReactorService2Grpc.Service2ImplBase() {
                        @Override
                        public Mono<Service2OuterClass.Service2Reply> getService2(Mono<Service2OuterClass.NoParams> request){
                            return Mono.just(
                                    Service2OuterClass.Service2Reply
                                            .newBuilder()
                                            .setReply("Hello from service 2")
                                            .build());

                        }

                    }));

    @BeforeEach
    public void setUp() throws Exception {
        String serverName = InProcessServerBuilder.generateName();
        grpcCleanup.register(InProcessServerBuilder
                .forName(serverName).directExecutor().addService(service1Impl).build().start());
        channel1 = grpcCleanup.register(
                InProcessChannelBuilder.forName(serverName).directExecutor().build());
        serverName = InProcessServerBuilder.generateName();
        grpcCleanup.register(InProcessServerBuilder
                .forName(serverName).directExecutor().addService(service2Impl).build().start());
        channel2 = grpcCleanup.register(
                InProcessChannelBuilder.forName(serverName).directExecutor().build());
        client = new GrpcClient();
    }

    @Test
    public void testService1(){

        Assertions.assertEquals("Hello from service 1", client.getService1(channel1).getResponse());
    }
    @Test
    public void testService2(){

        Assertions.assertEquals("Hello from service 2", client.getService2(channel2).getResponse());
    }
}

