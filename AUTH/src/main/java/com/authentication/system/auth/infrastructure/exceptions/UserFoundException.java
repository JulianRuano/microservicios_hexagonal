package com.authentication.system.auth.infrastructure.exceptions;

public class UserFoundException extends Exception{

    public UserFoundException() {
        super("Error: Usuario ya existe");
    }
    
}
