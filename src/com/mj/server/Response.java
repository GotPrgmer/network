package com.mj.server;

import com.mj.Http;

public class Response implements Http {

    private String statusCode;
    private String reasonPhrase;

    private String httpVersion;
    private String responseUri;

    private String date;

    private String contentType;

    private String contentLength;

    private String server;

    private String transferEncoding;

    private String location;

    private String cacheControl;

    private String contentEncoding;

    private String body;



    public Response( String statusCode, String reasonPhrase, String httpVersion, String date, String contentType, String contentLength, String server, String transferEncoding, String location, String cacheControl, String contentEncoding, String body) {
        this.statusCode = statusCode;
        this.reasonPhrase = reasonPhrase;
        this.httpVersion = httpVersion;
        this.date = date;
        this.contentType = contentType;
        this.contentLength = contentLength;
        this.server = server;
        this.transferEncoding = transferEncoding;
        this.location = location;
        this.cacheControl = cacheControl;
        this.contentEncoding = contentEncoding;
        this.body = body;
    }

    @Override
    public String getContentLength() {
        return this.contentLength;
    }

    @Override
    public String getContentType() {
        return this.contentType;
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
