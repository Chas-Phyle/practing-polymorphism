//Author: Charles E. Phyle III
//Date: 2/17/2022
//Class: COP-3330C



public class PersonalLoan extends Loan{

    double interestRate;

    public PersonalLoan(int loanNumber, String customerLast, double loanAmount, int term) {
        super(loanNumber, customerLast, loanAmount, term);
        setInterestRate(interestRate);
    }
    public double getInterestRate(){
        return interestRate;
    }
    
    public void setInterestRate(double interestRate){
        this.interestRate = interestRate + .027;
    }

    public String toString(){
        String results;

        results ="The Loan number is: "+ getLoanNumber() + " The Last name is:  " 
        + getCustomerLast()+ " The loan amount is for: " + getLoanAmount() + " The term is: "+ getTerm() + " years." + " The interest rate is: " + (interestRate*100)+"%";

        return results;

    }

    
}
