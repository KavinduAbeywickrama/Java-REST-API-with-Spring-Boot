package com.practice.restdemo.exception;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class CloudVendorExceptionHandler {

    @ExceptionHandler(value = {CloundVendorNotFoundException.class})
    public ResponseEntity<Object> handleCloudVendorNotFoundException(CloundVendorNotFoundException cloundVendorNotFoundException)
    {
        CloudVendorException cloudVendorException = new CloudVendorException(
                cloundVendorNotFoundException.getMessage(),
                cloundVendorNotFoundException.getCause(),
                HttpStatus.NOT_FOUND
        );

        return new ResponseEntity<>(cloudVendorException,HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<Object> handleCloudVendorNotCreateException
            (CloudVendorNotCreateException cloudVendorNotCreateException)
    {
        CloudVendorException cloudVendorException = new CloudVendorException(
                cloudVendorNotCreateException.getMessage(),
                cloudVendorNotCreateException.getCause(),
                HttpStatus.BAD_REQUEST
        );

        return new ResponseEntity<>(cloudVendorException,HttpStatus.BAD_REQUEST);
    }
}
