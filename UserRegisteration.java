package com.bridgelabz.userRegistrationSystemDay23;

public class UserRegisteration {


    public static void main(String[] args) {
        System.out.println("Welcome To User Registration Problem");
        System.out.println("----------------------------------------");
        UserRegisterationOprations operations = new UserRegisterationOprations();
        try {
            // 1: Validate First Name
            operations.userValidateFirstName.validate("Tushar");
            // 2: Validate Last Name
            operations.userValidateLastName.validate("Salunkhe");
            // 3: Validate Email_Id
            operations.userValidateEmail_ID.validate("abc.xyz@bl.co.in");
            // 4: Validate Mobile Number
            operations.userValidateMobileNo.validate("91 8828294897");
            // 5: Validate Password.
            operations.userValidatePassword.validate("Atushar@12");
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }
        System.out.println("----------------------------------------");
    }
}
