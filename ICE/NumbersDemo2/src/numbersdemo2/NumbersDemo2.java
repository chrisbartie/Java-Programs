package numbersdemo2;

import java.util.Scanner;

public class NumbersDemo2 {

    public static void main(String[] args) {

        Scanner scanMan = new Scanner(System.in);

        System.out.println("Please enter a number");
        int x = scanMan.nextInt();
        System.out.println("Please enter another number");
        int y = scanMan.nextInt();

        displayTwiceTheNumber(x, y);
        displayNumberPlusFive(x, y);
        displayNumberSquared(x, y);
    }

    public static void displayTwiceTheNumber(int a, int b) {
        int z = a * 2;
        int f = b * 2;
        System.out.println("Your numbers doubled are: " + z + " and " + f);

    }

    public static void displayNumberPlusFive(int a, int b) {
        int d = a + 5;
        int e = b + 5;
        System.out.println("Your numbers plus five are: " + d + " and " + e);

    }

    public static void displayNumberSquared(int a, int b) {
        int g = a * a;
        int h = b * b;
        System.out.println("Your numbers squared are: " + g + " and " + h);

    }
}
