package com.hotelmanagement.quanlikhachsan.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;


@Getter
public class AppError extends RuntimeException {
    private final HttpStatus statusCode;
    private final String errorCode;
    private Throwable rootCause;
    private final Map<String, Object> details = new HashMap<>();

    private AppError(String message, HttpStatus statusCode, String errorCode) {
        super(message);
        this.statusCode = statusCode;
        this.errorCode = errorCode;
    }
    // Factory Method
    public static AppError from(String message, HttpStatus statusCode, String errorCode) {
        return new AppError(message, statusCode, errorCode);
    }


    // Wrapper Method
    public AppError wrap(Throwable rootCause) {
        this.rootCause = rootCause;
        return this;
    }

    // Setter Chain Method (Fluent Interface)
    public AppError withDetail(String key, Object value) {
        this.details.put(key, value);
        return this;
    }
}
