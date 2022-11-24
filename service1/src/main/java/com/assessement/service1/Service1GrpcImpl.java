package com.assessement.service1;
import com.assessement.service1.Service1Grpc;
import com.assessement.service1.Service1OuterClass;
import net.devh.boot.grpc.server.service.GrpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;
//import org.apache.logging.log4j.Logger;

@GrpcService
public class Service1GrpcImpl extends ReactorService1Grpc.Service1ImplBase {
    Logger logger = LoggerFactory.getLogger(Service1GrpcImpl.class);
    @Override
    public Mono<Service1OuterClass.Service1Reply> getService1 (Mono<Service1OuterClass.NoParams> request) {
        logger.info("Service 1 responding.");
        return request.map(r -> Service1OuterClass.Service1Reply.newBuilder()
                .setReply("Hello from service 1")
                .build());
    }
}
