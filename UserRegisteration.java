package com.bridgelabz.userRegistrationSystemDay23;

public class UserRegisteration {


    public static void main(String[] args) {
        System.out.println("Welcome To User Registration Problem");
        System.out.println("----------------------------------------");
        UserRegisterationOprations operations = new UserRegisterationOprations();
        try {
            // 1: Validate First Name
            operations.validFirstName("Tushar");
            // 2: Validate Last Name
            operations.validLastName("Salunkhe");
            // 3: Validate Email_Id
            operations.validEmail_Id("abc.xyz@bl.co.in");
            // 4: Validate Mobile Number
            operations.validMobileFormat("91 8828294897");
            // 5: Validate Password.
            operations.validPassword("Atushar@12");
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }
        System.out.println("----------------------------------------");
    }
}
