/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

public class BasketballHeightSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of team members: ");
        int numMembers = scanner.nextInt();

        int[] heights = new int[numMembers];

        for (int i = 0; i < numMembers; i++) {
            System.out.print("Enter the height of team member " + (i + 1) + " (in cm): ");
            heights[i] = scanner.nextInt();
        }

        basketballHeightSort(heights);

        System.out.println("Sorted heights in descending order:");
        for (int height : heights) {
            System.out.println(height + "cm");
        }

        scanner.close();
    }

    public static void basketballHeightSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int h = 0; h < n - i - 1; h++) {
                if (arr[h] < arr[h + 1]) {
                    //Swap arr[h] and arr[h+1]
                    int temp = arr[h];
                    arr[h] = arr[h + 1];
                    arr[h + 1] = temp;
                    swapped = true;
                }
            }

            //If no two elements were swapped, then the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}
