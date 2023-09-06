package com.practice.restdemo.exception;

public class CloudVendorNotCreateException extends RuntimeException{

    public CloudVendorNotCreateException(String message) {
        super(message);
    }

    public CloudVendorNotCreateException(String message, Throwable cause) {
        super(message, cause);
    }
}
