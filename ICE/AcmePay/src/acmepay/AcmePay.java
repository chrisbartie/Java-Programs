package acmepay;


import java.util.Scanner;

// Declare the AcnePay class
public class AcmePay {
   // start the main method.
   public static void main(String[] args) {
       // Declare the object of scanner class.
       Scanner in = new Scanner(System.in);


       // prompt the user to enter the hours.
       System.out.print("The hours worked,: ");


       // input hours.
       int hours = in.nextInt();
       // promptthe user to enter the shift.
       System.out.print("Enter shift (1/2/3): ");


       int shift = in.nextInt();
       // declare variables.
       double pay, overtime = 0, totalPay = 0, retirement = 0, totalPay1 = 0;


       // check the condition.
       if (shift == 1) {
           // check the condition.
           if (hours <= 40)
               // calculate the pay.
               pay = hours * 17;


           else {
               // calculate the pay.
               pay = (40 * 17);
               // calculate the overtime.
               overtime = (hours - 40) * 17 * 1.5;


           }
           // calculate the pay.
           totalPay = pay + overtime;
           // display the statement on console.
           System.out.println("The hourly pay rate=$17");


       }
       // check the condition.
       else {
           // check the condition.
           if (shift == 2) {
               // display the statement on console.
               System.out.println("The hourly pay rate=$18.50");
               // check the condition.
               if (hours <= 40)
                   // calculate pay
                   pay = hours * 18.5;


               else {
                   // calculate pay.
                   pay = (40 * 18.5);
                   // calculate overtime.
                   overtime = (hours - 40) * 18.5 * 1.5;


               }


           }


           else {
               // display the statement.
               System.out.println("The hourly pay rate=$22");
               /// check the condition.
               if (hours <= 40)
                   // calculate the pay.
                   pay = hours * 22;


               else {
                   // calculate the pay.
                   pay = (40 * 22);
                   // calculate overtime.
                   overtime = (hours - 40) * 22 * 1.5;


               }


           }


           in.nextLine();
           // calculate totalpay.
           totalPay = pay + overtime;
           // prompt the user to check for retirement plan.
           System.out.print("Do you want to opt for retriement (y/n): ");


           String input = in.nextLine();
           // check the condition.
           if (input.equalsIgnoreCase("y"))
               // calculate retirement.
               retirement = 0.03 * totalPay;
       }
       // calculate the net pay.
       totalPay1 = totalPay - retirement;
       // display the details on console.
       System.out.println("The Regular pay = $" + pay);


       System.out.println("The Overtime pay = $" + overtime);


       System.out.println("The total of regular and overtime pay: $" + totalPay);
       System.out.println("The retirement deduction = $" + retirement);


       System.out.println("Net pay = $" + totalPay1);


   }


}
