package com.example.demo.model;

public class ResponseObject {
    private String message;

    public ResponseObject(String message) {
        this.message = message;
    }

    public ResponseObject() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
