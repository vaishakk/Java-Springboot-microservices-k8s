package com.assessement.gw;

public class ResponseModel {
    private final String response;
    ResponseModel(String response){
        this.response = response;
    }

    public String getResponse(){
        return this.response;
    }
}
