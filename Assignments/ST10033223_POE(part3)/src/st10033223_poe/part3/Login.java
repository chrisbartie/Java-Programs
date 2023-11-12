/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10033223_poe.part3;

public class Login{
  static String UserName, firstName, lastname, userPassword;
    static boolean containsUnderscore;
    public static boolean loginUser;
    static boolean validUn, validPw;

    public Login(String firstname, String lastName, String Username, String Password) {

        firstName = firstname;
        lastname = lastName;
        UserName = Username;
        userPassword = Password;

    }

    //Getters and setters
    public static String getUserName() {
        return UserName;
    }

    public static void setUserName(String username) {
        UserName = username;
    }

    public static String getPassword() {
        return userPassword;
    }

    public static void setPassword(String password) {
        userPassword = password;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static void setFirstName(String firstname) {
        firstName = firstname;
    }

    public static String getLastName() {
        return lastname;
    }

    public static void setLastName(String lastName) {
        lastname = lastName;
    }

    //check if username is valid
    public static boolean checkUserName(String username) {
        validUn = false;
        for (int i = 0; i < username.length(); i++) {

            if (username.charAt(i) == '_') {
                containsUnderscore = true;
            }
        }

        if (username.length() <= 5 && containsUnderscore == true) {
            validUn = true;
            return validUn;
        } else {

            return validUn;
        }
    }

    //check if password is valid
    public static Boolean checkPasswordComplexity(String UserPassword) {
        validPw = false;
        //code attribution 
        //this code was taken from w3schools
        //https://www.w3schools.com/java/java_booleans.asp
        //2023
        boolean foundCaptial = false;
        boolean foundSpecial = false;
        boolean foundNumber = false;
        boolean lengthCorrect = false;
        //Checks length is valid
        if ((UserPassword.length() >= 8)) {
            lengthCorrect = true;
        }

        for (int loop = 0; loop < UserPassword.length(); loop++) {
            //Looks for Digit
            if (Character.isDigit(UserPassword.charAt(loop))) {
                foundNumber = true;

            }
            //Looks for special character
            if (Character.isLetterOrDigit(UserPassword.charAt(loop))) {
            } else {
                foundSpecial = true;
            }
            //Looks for capital letter
            if (Character.isUpperCase(UserPassword.charAt(loop))) {
                foundCaptial = true;
            }
        }

        //Checks all boolean flags
        if ((lengthCorrect == true) && (foundNumber == true) && (foundSpecial == true) && (foundCaptial == true)) {
            validPw = true;
        }
        return validPw;
    }

    //checks username and password, returns the correct message
    public static String registerUser(String username, String Password) {

        if (checkUserName(username) == false) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
        }

        if (checkPasswordComplexity(Password) == false) {
            return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
        }
        {
            return "User successfully registered";
        }
    }

    public static boolean loginUser(String loginUserName, String loginPassword) {
        boolean detailsEqual = false;
        if (UserName.equals(loginUserName) && userPassword.equals(loginPassword)) {
            detailsEqual = true;
        }
        return detailsEqual;
    }

    public String returnLoginStatus(String LogUserName, String userPassword) {
        if (loginUser(LogUserName, userPassword) == true) {
            return "Welcome " + firstName + " " + lastname + ", it is great to see you again.";
        }
        return "Username or password incorrect, please try again";

    }
}

//Reference List/Bibliography
//Stack Overflow. 2022. How can i check for special characters in password validation in Java?, 4 April 2022.[Online]. Available at: https://stackoverflow.com/questions/71741186/how-can-i-check-for-special-characters-in-password-validation-in-java [Accessed 22 April 2023].
//w3schools. 2023. Java Booleans, [n.d]. [Online]. Availible at: https://www.w3schools.com/java/java_conditions.asp [Accessed 23 April 2023].
//Farrell, J. 2019. Java Programming. 9th Edition. Boston: Cengage. 
