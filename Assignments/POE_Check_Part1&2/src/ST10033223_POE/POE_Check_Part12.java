
package ST10033223_POE;

import java.util.Scanner;

public class POE_Check_Part12 {

    
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);

        System.out.println("Enter Username:");
        String Username = s.nextLine();

        System.out.println("Enter Password:");
        String Password = s.nextLine();

        System.out.println("Enter First Name:");
        String firstName = s.nextLine();

        System.out.println("Enter Last Name:");
        String lastName = s.nextLine();

        Login login = new Login(firstName, lastName, Username, Password);
        System.out.println(login.registerUser(Username, Password));

        System.out.println("Login - Username:");
        String Username2 = s.nextLine();

        System.out.println("Login - Password:");
        String Password2 = s.nextLine();

        System.out.println(login.returnLoginStatus(Username2, Password2)); 

        

        
    }

}

//Reference List/Bibliography
//Stack Overflow. 2022. How can i check for special characters in password validation in Java?, 4 April 2022.[Online]. Available at: https://stackoverflow.com/questions/71741186/how-can-i-check-for-special-characters-in-password-validation-in-java [Accessed 22 April 2023].
//
