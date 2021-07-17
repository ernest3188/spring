package com.springernest.libraryApi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
@Slf4j
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {

    /**
     * Adnotacja ExceptionHander sprawia, że jeśli wystąpi IllegalArgumentException
     * to kod z metody handleException zostanie wykonany.
     *
     * Opcjonalnie można w metodzie handleException dodać argumenty, ktore zostana uzupelnione. Patrz nizej request i e.
     * Podczas wystepowania wyjatkow, warto taka informacje zalogowac.
     *
     * Adnotacja ResponseStatus sprawi, ze endpoint w przypadku wystapienia wyjatku zwroci wybrany status http.
     * Bez tej adnotacji, endpoint zwroci 200 OK.
     */
    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorMessage handleException(HttpServletRequest request, IllegalArgumentException e) {
        log.error(request.getRequestURL() + " with error: " + e.getMessage());
        return new ErrorMessage(e.getMessage());
    }

}
