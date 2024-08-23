package com.trainingdev.td_bs_management_user.handler;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.trainingdev.td_bs_management_user.dto.ErrorResponse;

import static java.util.stream.Collectors.toList;

@RestControllerAdvice
public class XeptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleValidationExceptions(MethodArgumentNotValidException ex){
        String errors = ex.getBindingResult()
                .getAllErrors()
                .stream()
                .map(error -> ((FieldError) error).getField() + ":" + error.getDefaultMessage())
                .toList().toString();

        return new ErrorResponse(String.valueOf(HttpStatus.BAD_REQUEST.value()), errors);
    }
}
