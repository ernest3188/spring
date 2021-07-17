package com.springernest.libraryApi;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Informacja jaki zwrocic status http, jesli wystapi wyjatek.
 */
@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class InvalidBookException extends RuntimeException {

}
