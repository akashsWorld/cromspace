package com.cromxt.space.exception.handlers;


import com.cromxt.space.exception.SpaceUserNotFound;
import com.cromxt.space.exception.response.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class SpaceControllerExceptionHandlers {

    @ExceptionHandler(SpaceUserNotFound.class)
    public ErrorResponse spaceUserNotFound(RuntimeException message) {
        return new ErrorResponse(message.getMessage());
    }
}
