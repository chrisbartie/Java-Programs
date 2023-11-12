package ST10033223_POE;

//author chris bartie - st10033223
 
public class Login {

    static String UserName, firstname, lastname, password;
    static boolean containsUnderscore;
    public static boolean loginUser;
    static boolean validUn, validPw;
   

    public Login(String firstName, String lastName, String Username, String Password) {

        firstname = firstName;
        lastname = lastName;
        UserName = Username;
        password = Password;

    }

    public boolean GetcheckUserName(String username) {
        for (int i = 0; i < username.length(); i++) {

            if (username.charAt(i) == '_') {
                containsUnderscore = true;
            }
        }

        if (username.length() <= 5 && containsUnderscore == true) {
            containsUnderscore = true;
            return true;
        } else {
            return false;

        }
    }

    public static boolean checkPasswordComplexity(String password) {
        boolean containsUpper = false;
        boolean containsDigit = false;
        boolean containsSymbol = false;
        String PasswordRules = password;
        boolean passwordValid;
        
        //code attribution 
        //this code was taken from w3schools
        //https://www.w3schools.com/java/java_booleans.asp
        //2023
        

        passwordValid = PasswordRules.length() >= 8;

        for (int i = 0; i < PasswordRules.length(); i++) {
            char currentChar = PasswordRules.charAt(i);

            if (Character.isUpperCase(currentChar)) {
                containsUpper = true;
            }

            if (Character.isDigit(currentChar)) {
                containsDigit = true;
            }

            //code attribution
            //this method was taken from stack overflow
            //https://stackoverflow.com/questions/71741186/how-can-i-check-for-special-characters-in-password-validation-in-java
            //Kivan Ilangakoon
            //2022
            //https://stackoverflow.com/users/5254942/kivan-ilangakoon
            
            if (currentChar == '$' || currentChar == '#' || currentChar == '?' || currentChar == '!' || currentChar == '_' || currentChar == '=' || currentChar == '%') {
                if (!Character.isLetterOrDigit(currentChar));
            }
            {
                containsSymbol = true;
            }
        }
        return (containsUpper == true) && (containsDigit == true) && (containsSymbol == true) && (passwordValid == true);

    }

    public String registerUser(String username, String password) {

        validUn = GetcheckUserName(username);

        validPw = checkPasswordComplexity(password);

        if ((validUn == true) && (validPw == true)) {
            return "Username and Password successfully captured.";
        } else if (validUn == false) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
        } else {
            return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character";
        }
    }

    public boolean loginUser(String userName, String loginPassword) {
        boolean detailsEqual = false;
        if (userName.equals(UserName) || loginPassword.equals(password)) {
            detailsEqual = true;
        }
        return detailsEqual;
    }

    public String returnLoginStatus(String UserName, String password) {
        if (loginUser(UserName, password) == true) {
            return "Welcome " + firstname + " " + lastname + ", it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again";

        }

    }
}

//Reference List/Bibliography
//Stack Overflow. 2022. How can i check for special characters in password validation in Java?, 4 April 2022.[Online]. Available at: https://stackoverflow.com/questions/71741186/how-can-i-check-for-special-characters-in-password-validation-in-java [Accessed 22 April 2023].
//
