package com.cromxt.space.exception.handlers;

import com.cromxt.space.exception.UserAlreadyExists;
import com.cromxt.space.exception.response.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControllerExceptionHandlers {

    @ExceptionHandler(UserAlreadyExists.class)
    public ErrorResponse userAlreadyExists(RuntimeException message) {
        return new ErrorResponse(message.getMessage());
    }

}
