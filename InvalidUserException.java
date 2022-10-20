package com.bridgelabz.userRegistrationSystemDay23;

public class InvalidUserException extends Exception {
    String message;
    public InvalidUserException(String message){
        super(message);
    }
}
