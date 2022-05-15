//Author: Charles E. Phyle III
//Date: 2/17/2022
//Class: COP-3330C



public class BusinessLoan extends Loan{

    private double interestRate;

    public BusinessLoan(int loanNumber, String customerLast, double loanAmount, int term, double interestRate) {
        super(loanNumber, customerLast, loanAmount, term);
       setInterestRate(interestRate);
    }

    public double getInterestRate(){
        return interestRate;
    }
    
    public void setInterestRate(double interestRate){
        this.interestRate = interestRate + .032;
    }

    public String toString(){
        String results;

        results ="The Loan number is: "+ getLoanNumber() + " The buisness name is:  " 
        + getCustomerLast()+ " The loan amount is for: " + getLoanAmount() + " The term is: "+ getTerm() + " years." + " The interest rate is: " + (interestRate*100)+"%";

        return results;

    }


    

}
