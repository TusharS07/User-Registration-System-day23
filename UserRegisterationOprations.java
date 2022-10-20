package com.bridgelabz.userRegistrationSystemDay23;

public class UserRegisterationOprations {
    //UC1:-As a User need to enter a valid First Name
    //First name starts with Cap and has minimum 3 characters
    public boolean validFirstName(String fname) throws InvalidUserException {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        boolean checkValid = fname.matches(regex);
        if (checkValid) {
            System.out.println("Your First name is Valid.");
        } else {
            System.out.println("First characters Should be Capital");
            throw new InvalidUserException("Your First Name is Invalid ");
        }
        return checkValid;

    }


    //UC2:-As a User need to enter a valid Last Name
    //Last name starts with Cap and has minimum 3 characters
    public boolean validLastName(String lname) throws InvalidUserException{
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        boolean checkValid = lname.matches(regex);

        if (checkValid) {
            System.out.println("Your Last name is Valid.");
        } else {
            System.out.println("Your Last name is Invalid.");
            throw new InvalidUserException("First characters Should be Capital");
        }
        return checkValid;
    }

    //UC3:-As a User need to enter a valid emailId
    //enter a valid email - E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @ and . positions
    public boolean validEmail_Id(String emailId) throws InvalidUserException {
        String regex = "^[a-zA-Z0-9]+([.][A-Za-z]+)*@[a-zA-Z]+[.]+[a-zA-Z]{2,3}+([.][A-Za-z]+)*$";
        boolean checkValid = emailId.matches(regex);

        if (checkValid) {
            System.out.println("Your Email_ID is Valid.");
        } else {
            System.out.println("Your Email_ID is Invalid.");
            throw new InvalidUserException("Please Enter valid EmailId");
        }
        return checkValid;
    }

    //UC4:-As a User need to follow pre-defined Mobile Format
    //Mobile Format - E.g. 91 9919819801 - Country code follow by space and 10digit number
    public boolean validMobileFormat(String mobNo) throws InvalidUserException{
        String regex = "(91|0)?\\s?[6-9][0-9]{9}$";
        boolean checkValid = mobNo.matches(regex);

        if (checkValid) {
            System.out.println("Your Mobile Number is Valid.");
        } else {
            System.out.println("Your Mobile Number is Invalid.");
            throw new InvalidUserException("Please Enter valid Mobile Number");
        }
        return checkValid;
    }

    //UC5= As a User need to follow pre -defined Password rules.
    //Rule1= min 8 Characters

    //UC6= Rule2=Should have at least 1 Upper Case
    //UC7= Rule3= Should have at least 1 numeric number in the password
    //UC8 = Rule 4 = Has exactly 1 Special Character
    public boolean validPassword(String pass) throws InvalidUserException{
        //String regex = "^[a-zA-Z]{8,}$"; //Rule 1
        //String regex = "^[A-Z]{1}[a-zA-Z]{7,}$"; //Rule 2
        //String regex = "^[a-zA-Z0-9]{8,}$"; //Rule 3
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z0-9@$!%*?&]{5,}$"; //Rule 4
        boolean checkValid = pass.matches(regex);

        if (checkValid) {
            System.out.println("Entered Password is Valid.");
        } else {
            System.out.println("Entered Password is Invalid.");
            throw new InvalidUserException("Password Should have at least 1 Special charater, 1 numeric number And 1 upper case latter ");
        }
        return checkValid;
    }
}

