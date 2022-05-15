//Author: Charles E. Phyle III
//Date: 2/17/2022
//Class: COP-3330C



public abstract class Loan implements LoanConstants{

    private int loanNumber;
    private String customerLast;
    private double loanAmount;
    private double interestRate;
    private int term;
    //private String errorMoney = "This loan amount is to much money!";     //Fix this string

    public Loan (int loanNumber, String customerLast, double loanAmount, int term){
        this.setLoanNumber(loanNumber);
        this.setCustomerLast(customerLast);
        this.setLoanAmount(loanAmount);
        this.setTerm(term);
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        
        if(term != ShortTerm && term != MediumTerm && term != LongTerm){        //Used to set the default term to 3 years if not specified
            term = ShortTerm;                   
            this.term = term;
        }
        else{
            this.term = term;
        }
       
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        if (loanAmount > MaxLoan ){                               //Set loanAmount to 0 if the request is over $50000
            this.loanAmount = 0;
        }else{
        this.loanAmount = loanAmount;
        }
    }

    public String getCustomerLast() {
        return customerLast;
    }

    public void setCustomerLast(String customerLast) {
        this.customerLast = customerLast;
    }

    public int getLoanNumber() {
        return loanNumber;
    }

    public void setLoanNumber(int loanNumber) {
        this.loanNumber = loanNumber;
    }

    public String toString() {
        return "Loan [customerLast=" + customerLast + ", interestRate=" + interestRate + ", loanAmount=" + loanAmount
                + ", loanNumber=" + loanNumber + ", term=" + term + "]";
    }

    public boolean equals (Object obj){
        if(!(obj instanceof Loan)){
            return false;
        }
        boolean result = false;
        if(this.getLoanAmount() == ((Loan)obj).getLoanAmount()){
            result = true;
        }
        return result;
    }


}
