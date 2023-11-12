/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package createloans;

/**
 *
 * @author chris
 */
public abstract class Loan implements LoanConstants {

    private int LoanNumber;
    private String Surname;
    private double InterestRate, LoanAmount;
    private int Term;

    public Loan(int loanNumber, String surname, double loanAmount, int term) {
        setLoanNumber(loanNumber);
        setSurname(surname);
        setLoanAmount(loanAmount);
        setTerm(term);
    }
    
    public String toString()
    {
        return "Loan Number: " + getLoanNumber() + "/n" +
                "Surname: " + getSurname() + "/n" + 
                "Term: " + getTerm() + "/n" +
                "Interest Rate: " + getInterestRate() + "/n" + 
                "Loan Amount: " + getLoanAmount() + "/n";
    }

    /**
     * @return the LoanNumber
     */
    public int getLoanNumber() {
        return LoanNumber;
    }

    /**
     * @param LoanNumber the LoanNumber to set
     */
    public void setLoanNumber(int LoanNumber) {
        this.LoanNumber = LoanNumber;
    }

    /**
     * @return the Surname
     */
    public String getSurname() {
        return Surname;
    }

    /**
     * @param Surname the Surname to set
     */
    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    /**
     * @return the InterestRate
     */
    public double getInterestRate() {
        return InterestRate;
    }

    /**
     * @param InterestRate the InterestRate to set
     */
    public void setInterestRate(double InterestRate) {
        this.InterestRate = InterestRate;
    }

    /**
     * @return the LoanAmount
     */
    public double getLoanAmount() {
        return LoanAmount;
    }

    /**
     * @param LoanAmount the LoanAmount to set
     */
    public void setLoanAmount(double LoanAmount) {
        if (LoanAmount <= 100000) {
            this.LoanAmount = LoanAmount;
        } else {
            this.LoanAmount = -1;
        }
    }

    /**
     * @return the Term
     */
    public int getTerm() {
        return Term;
    }

    /**
     * @param Term the Term to set
     */
    public void setTerm(int Term) {
        if (Term != SHORT_TERM && Term != MEDIUM_TERM && Term != LONG_TERM) 
            this.Term = SHORT_TERM;
         else {
            this.Term = Term;
        }
    }
}
