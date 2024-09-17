package org.example.recapprojectspring;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice// Annotation showing that the class provides global exception handling for all endpoints
@ResponseStatus(HttpStatus.BAD_REQUEST) //Sets the default HTTP status to BAD_REQUEST

public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)

    public ErrorMessage handleGlobalExceptions(Exception e){
//        Creates an ErrorMessage instance with the details of the exception
        ErrorMessage errorMessage = new ErrorMessage("An error occurred: " + e.getMessage());
        return errorMessage;
    }
}
