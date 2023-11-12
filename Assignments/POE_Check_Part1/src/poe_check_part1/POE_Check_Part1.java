package poe_check_part1;

public class POE_Check_Part1 {

    public static void main(String[] args) {

        String UserName, firstname, lastname, password;
        String PasswordComplexity;
        boolean containsUnderscore;
        boolean loginUser;
        boolean usernameValid, passwordValid;
        String registerUser;
        String returnLoginStatus;
        String SpecialCharacters = "`!@#$%^&*()_+{}:>?<`";
        boolean checkPasswordComplexity;
        String loginUserName;
        
        
        

  

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

        }//end main

    }
