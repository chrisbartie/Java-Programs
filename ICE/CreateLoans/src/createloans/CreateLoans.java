/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//PG 566
package createloans;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class CreateLoans {

    private static final Scanner scan = new Scanner(System.in);
    private static final Loan[] loan = new Loan[5];
    private static int curPos = 0;
    public static void main(String[] args) {

        printMenu();
        int input = scan.nextInt();
        scan.nextLine();

        while (input != 3) {
            switch (input) {
                case 1:
                    addLoan();
                    break;
                case 2:
                    displayLoans();
                    break;
                default:
                    if (input != 3) {
                        System.out.println("Invalid input");
                    }
                    printMenu();
                    input = scan.nextInt();
                    scan.nextLine();
            }
        }

    }

    public static void printMenu() {
        System.out.println("Loan Application");
        System.out.println("===========================================");
        System.out.println("1) Add a loan");
        System.out.println("2) Display all Loans");
        System.out.println("3) Exit");

    }

    private static void addLoan() {
        System.out.println("Are you adding a business loan or a personal loan (b or p): ");
        String loanType = scan.nextLine();

        while (loanType.equals("p") && !loanType.equals("b")) {
            System.out.println("Are you adding a business loan or a personal loan (b or p): ");
            loanType = scan.nextLine();

        }
        String surname;
        double loanAmount;
        int term;
        System.out.println("Enter the lenders surname: ");
        surname = scan.nextLine();
        System.out.println("Enter the loan amount: ");
        loanAmount = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter the length of the loan");
        term = scan.nextInt();
        scan.nextLine();
        
        Loan 1 = addLoan(surname, loanAmount, term, curPos, loanType);
        loan[curPos] = 1;
        curPos++;

    }

    public Loan addLoan(String surname, double loanAmount, int term, int loanNumber, String loanType) {
        if (loanType.equals("b")) {
            return new BusinessLoan(loanNumber, surname, loanAmount, term);
        } else {
            return new PersonalLoan(loanNumber, surname, loanAmount, term);
        }
    }

    private static void displayLoans() {
        System.out.println("Loans");
        System.out.println("========");
        for(int i = 0; i < curPos; i++)
        {
            System.out.println(loan[i]);
        }
    }

}
