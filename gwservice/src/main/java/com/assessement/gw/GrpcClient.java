package com.assessement.gw;

import com.assessement.service1.ReactorService1Grpc;
import com.assessement.service1.Service1OuterClass;
import com.assessement.service2.ReactorService2Grpc;
import com.assessement.service2.Service2OuterClass;
import io.grpc.ManagedChannel;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class GrpcClient {

    public ResponseModel getService1(ManagedChannel channel){
        ReactorService1Grpc.ReactorService1Stub stub
                = ReactorService1Grpc.newReactorStub(channel);

        Mono<Service1OuterClass.Service1Reply> helloResponse = stub.getService1(Service1OuterClass.NoParams.newBuilder()
                .build());
        return new ResponseModel(helloResponse.block().getReply());
    }

    public ResponseModel getService2(ManagedChannel channel){

        ReactorService2Grpc.ReactorService2Stub stub
                = ReactorService2Grpc.newReactorStub(channel);

        Mono<Service2OuterClass.Service2Reply> helloResponse = stub.getService2(Service2OuterClass.NoParams.newBuilder()
                .build());
        return new ResponseModel(helloResponse.block().getReply());
    }
}
