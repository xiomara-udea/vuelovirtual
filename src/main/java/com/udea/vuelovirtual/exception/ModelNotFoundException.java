package com.udea.vuelovirtual.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//1xx -->  Informacion
//2XX --> Success
//3XX --> Redireccion
//4XX --> Errores del Cliente
//5XX -->  Errores del Server
//RFC 2616
@ResponseStatus(HttpStatus.NOT_FOUND)  //404 NOT FOUND
public class ModelNotFoundException extends RuntimeException {
    public ModelNotFoundException(String message) {
        super(message);
    }
}
