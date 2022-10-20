package com.bridgelabz.userRegistrationSystemDay23;
import org.junit.Assert;
import org.junit.Test;

public class UserRegisterationTest {
    UserRegisterationOprations userRegisterationOprations = new UserRegisterationOprations();

    //UC10 = Write JUnit Test to validate the User Entry for First Name, Last Name, Email, Mobile, and Password.
    //- Write Junit Test for Happy as well as Sad test case.
    //- Happy Test Case validates the Entry Successfully
    //- Sad Test Cases fails the Entry


    //All valid Test Cases *****************Valid Test ************************
    //#**Test First Name Is Valid
    @Test
    public void checkFirstNameValid() {
        try {
            Assert.assertTrue(userRegisterationOprations.userValidateFirstName.validate("Tushar"));
        } catch (InvalidUserException e) {
            System.out.println("Exception Occurs\n" + e);
        }
    }

    //#**Test Last Name Is Valid
    @Test
    public void checkLastNameValid() {
        try {
            Assert.assertTrue(userRegisterationOprations.userValidateLastName.validate("Salunkhe"));
        } catch (InvalidUserException e) {
            System.out.println("Exception Occurs\n" + e);
        }
    }

    //#**Test Email_Id is Valid
    @Test
    public void checkEmail_IdValid() {
        try {
            Assert.assertTrue(userRegisterationOprations.userValidateEmail_ID.validate("abc.xyz@bl.co.in"));
        } catch (InvalidUserException e) {
            System.out.println("Exception Occurs\n" + e);
        }
    }

    //#**Test MobileNumber is Valid
    @Test
    public void checkMobile_NumberValid() {
        try {
            Assert.assertTrue(userRegisterationOprations.userValidateMobileNo.validate("91 9919819801"));
        } catch (InvalidUserException e) {
            System.out.println("Exception Occurs\n" + e);
        }
    }

    //#**Test Password is Valid
    @Test
    public void checkPasswordValid() {
        try {
            Assert.assertTrue(userRegisterationOprations.userValidatePassword.validate("Tushar@12"));
        } catch (InvalidUserException e) {
            System.out.println("Exception Occurs\n" + e);
        }
    }


    //All Invalid Test Cases *****************Invalid Test ************************
    //#**Test First Name Is Invalid
    @Test
    public void checkFirstNameInvalid() {
        try {
            Assert.assertFalse(userRegisterationOprations.userValidateFirstName.validate("tushar"));
        } catch (InvalidUserException e) {
            System.out.println("Exception Occurs\n" + e);
        }
    }
    //#**Test Last Name Is Invalid
    @Test
    public void checkLastNameInvalid() {
        try {
            Assert.assertFalse(userRegisterationOprations.userValidateLastName.validate("salunkhe"));
        } catch (InvalidUserException e) {
            System.out.println("Exception Occurs\n" + e);
        }
    }

    //#**Test Email_Id is Invalid
    @Test
    public void checkEmail_IdInvalid() {
        try {
            Assert.assertFalse(userRegisterationOprations.userValidateEmail_ID.validate(".abc.xyz@bl.co.in"));
        } catch (InvalidUserException e) {
            System.out.println("Exception Occurs\n" + e);
        }
    }

    //#**Test MobileNumber is Invalid
    @Test
    public void checkMobile_NumberInvalid() {
        try {
            Assert.assertFalse(userRegisterationOprations.userValidateMobileNo.validate("91 928282"));
        } catch (InvalidUserException e) {
            System.out.println("Exception Occurs\n" + e);
        }
    }

    //#**Test Password is Invalid
    @Test
    public void checkPasswordInvalid() {
        try {
            Assert.assertFalse(userRegisterationOprations.userValidatePassword.validate("tushar@12"));
        } catch (InvalidUserException e) {
            System.out.println("Exception Occurs\n" + e);
        }
    }

}

