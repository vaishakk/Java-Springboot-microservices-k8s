package com.assessement.gw;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class GwController {
    Logger logger = LoggerFactory.getLogger(GwController.class);
    @RequestMapping(value = "/service1", method = RequestMethod.GET)
    public String getService1(){
        logger.info("Calling service 1 from gateway.");
        logger.info("Connecting to host" + System.getenv("SERVICE1_SERVICE_HOST") + "at port 9090");
        try{
        ManagedChannel channel = ManagedChannelBuilder.forAddress(System.getenv("SERVICE1_SERVICE_HOST"),
                        9090)
                .usePlaintext()
                .build();
            GrpcClient client = new GrpcClient();
            logger.info("Getting response from service 1.");
            return client.getService1(channel).getResponse();
       }

        catch(Exception e) {
            logger.error("Connection error - service 1" + e);
            return "Connection error - service 1";
        }

    }

    @RequestMapping(value = "/service2", method = RequestMethod.GET)
    public String getService2() {
        logger.info("Calling service 2 from gateway.");
        logger.info("Connecting to host" + System.getenv("SERVICE2_SERVICE_HOST") + "at port 9090");
        try {
            ManagedChannel channel = ManagedChannelBuilder.forAddress(System.getenv("SERVICE2_SERVICE_HOST"),
                            9090)
                    .usePlaintext()
                    .build();
            GrpcClient client = new GrpcClient();
            logger.info("Getting response from service 2.");
            return client.getService2(channel).getResponse();
        } catch (Exception e) {
            logger.error("Connection error - service 2" + e);
            return "Connection error - service 2";
        }
    }
}
