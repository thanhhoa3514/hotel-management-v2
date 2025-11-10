package com.hotelmanagement.quanlikhachsan.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorDefinition {
    ROOM_NOT_FOUND("Room not found.", HttpStatus.NOT_FOUND, "ROOM_001"),
    DUPLICATE_ID("Duplicate ID.", HttpStatus.CONFLICT, "ROOM_002"),
    ROOM_IN_USE("Cannot delete room that is currently occupied or reserved.", HttpStatus.CONFLICT, "ROOM_003");
    private final String message;
    private final HttpStatus statusCode;
    private final String errorCode;


    ErrorDefinition(String message, HttpStatus statusCode, String errorCode) {
        this.message = message;
        this.statusCode = statusCode;
        this.errorCode = errorCode;
    }

    public AppError toAppError() {
        return AppError.from(this.message, this.statusCode, this.errorCode);
    }
}
