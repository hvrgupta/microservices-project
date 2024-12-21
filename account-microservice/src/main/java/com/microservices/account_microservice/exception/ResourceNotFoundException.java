package com.microservices.account_microservice.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String resourceName, String fieldName, String fieldValue) {
        super("Resource " + resourceName + " not found for " + fieldName + " " + fieldValue);
    }
}
