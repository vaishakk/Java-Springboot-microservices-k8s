package com.assessement.service2;

import net.devh.boot.grpc.server.service.GrpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

@GrpcService
public class Service2GrpcImpl extends ReactorService2Grpc.Service2ImplBase {
    Logger logger = LoggerFactory.getLogger(Service2GrpcImpl.class);
    @Override
    public Mono<Service2OuterClass.Service2Reply> getService2 (Mono<Service2OuterClass.NoParams> request) {
        logger.info("Service 2 responding.");
        return request.map(r -> Service2OuterClass.Service2Reply.newBuilder()
                .setReply("Hello from service 2")
                .build());
    }
}
