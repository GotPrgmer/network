package com.mj.client;

import com.mj.Http;
import com.mj.Method;

public class Request implements Http {

    private String host;
    private String contentLength;

    private String contentType;

    private Method method;

    private String requestUri;

    private String httpVersion;

    private String body;

    public Request(String host , String contentType,String  contentLength, Method method, String requestUri, String httpVersion,String body) {
        this.host = host;
        this.contentType = contentType;
        this.contentLength = contentLength;
        this.method = method;
        this.requestUri = requestUri;
        this.httpVersion = httpVersion;
        this.body = body;
    }

    public String getHost() {
        return this.host;
    }

    @Override
    public String getContentLength() {
        return this.contentLength;
    }

    @Override
    public String getContentType() {
        return this.contentType;
    }

    public Method getMethod() {
        return this.method;
    }

    public String getRequestUri() {
        return this.requestUri;
    }

    @Override
    public String getHttpVersion() {
        return this.httpVersion;
    }

    @Override
    public String getBody() {
        return this.body;
    }
}
