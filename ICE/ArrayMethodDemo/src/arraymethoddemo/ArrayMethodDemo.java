//page 409
package arraymethoddemo;

public class ArrayMethodDemo {

    static int[] array = new int[8];

    static int sum = 0;

    public static void main(String[] args) {

        displayArray();                 //calling method 
        displayReverseArray();
        displaySumArray();
        displayLessArray();
        displayHigherArray();

    }//end main

    public static void displayArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }//end for

    }//end displayArray

    public static void displayReverseArray() {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + "  ");
        }//end for

    }//end displayReverseArray

    public static void displaySumArray() {

        int i;
        for (i = 0; i < array.length; i++) {
            sum += array[i];
        }//end fot 
        System.out.println(sum);
    }//end displaySumArray

    public static void displayLessArray() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < sum) {
                System.out.print(array[i] + " ");
            }
        }
    }//end displayLessArray

    public static void displayHigherArray() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double avg = sum / (double) array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > avg) {
                System.out.print(array[i] + " ");
            }
        }// end displayHigherArray

    }
}//end Program
