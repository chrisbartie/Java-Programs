
package enumapplication;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class EnumApplication {
    
    enum Days{Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday};
   
    public static void main(String[] args) {
        Days day_input; //never name something like this
        String dayInput;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a day of the week");
        
        for(Days day : Days.values())
            System.out.print(day + " ");
        
        dayInput = scan.nextLine();
        
        day_input = Days.valueOf(dayInput);
        
        switch(day_input)
        {
            case Saturday: System.out.println("The business is open 10am to 6pm");
                    break;
            case Sunday: System.out.println("The business is open 11am to 5pm");
                    break;
            default: System.out.println("The business is open 9am to 9pm");

                    
        }
    }
    
}
