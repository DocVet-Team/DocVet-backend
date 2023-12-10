package br.com.docvet.docvet.domain.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class ErrorAdvice {

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ApiError handlerExceptionHandler(NotFoundException exception, HttpServletRequest request) {
        ApiError apiError;
        apiError = new ApiError(HttpStatus.NOT_FOUND.value(), exception.getMessage(), request.getServletPath());
        return apiError;
    }

}
