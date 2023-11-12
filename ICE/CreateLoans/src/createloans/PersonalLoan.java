/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package createloans;

/**
 *
 * @author chris
 */
public class PersonalLoan extends Loan{
     public PersonalLoan(int loanNumber, String surname, double loanAmount, int term) {
        super(loanNumber, surname, loanAmount, term);
        setInterestRate(0.13);
    }
    
}
