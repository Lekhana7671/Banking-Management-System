package com.bankease;

public class DuplicateAccountException extends Exception {

    public DuplicateAccountException(String message) {
        super(message);
    }
}
