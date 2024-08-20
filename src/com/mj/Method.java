package com.mj;

public enum Method {
    GET("GET"),
    POST("POST"),
    PUT("PUT"),
    PATCH("PATCH"),
    OPTIONS("OPTIONS"),
    HEAD("HEAD");

    private String method;

    private Method(String method){
        this.method = method;
    }

    public String getMethod(){
        return method;
    }

}
