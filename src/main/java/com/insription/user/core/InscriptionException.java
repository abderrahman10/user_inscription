package com.insription.user.core;

public class InscriptionException extends RuntimeException {
    public InscriptionException(String emailAlreadyUsed) {
        super(emailAlreadyUsed);
    }
}
