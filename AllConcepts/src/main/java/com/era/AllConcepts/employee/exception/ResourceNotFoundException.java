package com.era.AllConcepts.employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String resourceName, String fieldName, Long fieldValue) {
        super(String.format(" %s not found with %s : '%s'", resourceName, fieldName, fieldValue)); // employee not found with id : 1
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    private String resourceName;
    private String fieldName;
    private Long fieldValue;

    public String getResourceName() {
        return resourceName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public Long getFieldValue() {
        return fieldValue;
    }
}
