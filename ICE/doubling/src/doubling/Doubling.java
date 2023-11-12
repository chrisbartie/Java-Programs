package doubling;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Doubling {

    public static void main(String[] args) {
        String strNumber = JOptionPane.showInputDialog("Enter a number");
        System.out.println(strNumber);
        int myNumber = Integer.parseInt(strNumber);

        int myAnswer = myNumber * 2;

        System.out.println(myAnswer);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        String strNumber2 = scanner.nextLine();
        int myNumber2 = scanner.nextInt();
        int myAnswer2 = myNumber2 * 2;
        System.out.println(myAnswer2);
    }

}
