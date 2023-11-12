/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package st10033223_poe.part3;

import java.util.Scanner;
// Author - ST10033223 - Christopher Bartie

public class ST10033223_POEPart3 {

    public static void main(String[] args) {
        
        Task task = new Task();
        task.startKanban();

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

        System.out.println("Login with Username:");
        String Username2 = s.nextLine();

        System.out.println("Login with Password:");
        String Password2 = s.nextLine();

        System.out.println(login.returnLoginStatus(Username2, Password2));

    }

}//end class

//Reference List/Bibliography
//Stack Overflow. 2022. How can i check for special characters in password validation in Java?, 4 April 2022.[Online]. Available at: https://stackoverflow.com/questions/71741186/how-can-i-check-for-special-characters-in-password-validation-in-java [Accessed 22 April 2023].
//Farrell, J. 2019. Java Programming. 9th Edition. Boston: Cengage. 
//w3schools. 2023. Java Booleans, [n.d]. [Online]. Availible at: https://www.w3schools.com/java/java_conditions.asp [Accessed 23 April 2023].


