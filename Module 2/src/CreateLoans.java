import java.util.Scanner;
//Author: Charles E. Phyle III
//Date: 2/17/2022
//Class: COP-3330C


public class CreateLoans {
    

    public static void main(String[] args) {
        double[] personalLoans = new double[5];
        double[] buisnessLoans = new double[5]; 
        Object[] totalLoans = new Object[5];
        Object[] allLoans = new Object[5];
        Scanner keyboard = new Scanner(System.in);
       

        System.out.println("What is the current prime interest rate?");
        double primeInterest = keyboard.nextDouble();
        primeInterest = percentCalculator(primeInterest);
        
        for (int i = 0; i < totalLoans.length; i++) {
            System.out.println("What kind of loan is this? Personal/Business");
            String loanType = keyboard.next();
            int loanNumber = i + 1;
            if (loanType.equals("Personal")) {
                PersonalLoan loan = new PersonalLoan(loanNumber, "last", 0, 0);
                System.out.println("What is your last name?");
                String lastName = keyboard.next();
                loan.setCustomerLast(lastName);
                System.out.println("How much is the loan for? Up to $50,000.");
                double loanAmount = keyboard.nextDouble();
                loan.setLoanAmount(loanAmount);
                System.out.println("How long would you like the term to be? 3,7,15 years?");
                int termLength = keyboard.nextInt();
                loan.setTerm(termLength);
                loan.setInterestRate(primeInterest);
                allLoans[i] = loan;
                totalLoans[i] = loan.getLoanAmount();
                personalLoans[i] = loan.getLoanAmount() + (loan.getTerm()*loan.getInterestRate()*loan.getLoanAmount());
            
            } else if (loanType.equals("Business")) {

                BusinessLoan loan = new BusinessLoan(loanNumber, "last", 0, 0, 0);
                System.out.println("What is the Business name?");
                String businessName = keyboard.next();
                loan.setCustomerLast(businessName);
                System.out.println("How much is the loan for? Up to $50,000.");
                double loanAmount = keyboard.nextDouble();
                loan.setLoanAmount(loanAmount);
                System.out.println("How long would you like the term to be? 3,7,15 years?");
                int termLength = keyboard.nextInt();
                loan.setTerm(termLength);
                loan.setInterestRate(primeInterest);
                allLoans[i] = loan;
                totalLoans[i] = loan.getLoanAmount();
                buisnessLoans[i] = loan.getLoanAmount()+ (loan.getTerm()*loan.getInterestRate()*loan.getLoanAmount());

            }

        }
       double personalTotal = 0;
        for (int i = 0; i < personalLoans.length; i++) {
            personalTotal = (double) personalLoans[i] + personalTotal;
        }

        double buisnessTotal=0;
        for (int i = 0; i < buisnessLoans.length; i++) {

            buisnessTotal = (double)buisnessLoans[i] + buisnessTotal;
        }
        double totalDue = buisnessTotal + personalTotal;
        double totalMoneyBarrowed=0;
        for (int i = 0; i < totalLoans.length; i++) {
            totalMoneyBarrowed = (double)totalLoans[i] + totalMoneyBarrowed;
        }
        System.out.println("The total personal loans owed at due date is: " + personalTotal);
        System.out.println("The total buisness loans owed at due date is: "+ buisnessTotal);
        System.out.println("The total amount owed to "+Loan.CompanyName+" at due date of all loans is: " + totalDue);
        System.out.println("The total amount " + Loan.CompanyName +" has loaned out is:" + totalMoneyBarrowed);
        for(int i =0; i<totalLoans.length;i++){
            System.out.println(allLoans[i]);
        }
        System.out.println("Do you wish to review a loan?(Y/N)");
        String review = keyboard.next();
        if (review.equals("Y")||review.equals("yes")||review.equals("Yes")) {
            System.out.println("Which loan number from above would you like to review?");
            int loanNumber = keyboard.nextInt();
            switch (loanNumber-1) {
                case 1:
                    System.out.println(allLoans[loanNumber-1]);

                    break;
                case 2:
                    System.out.println(allLoans[loanNumber-1]);
                    break;
                case 3:
                    System.out.println(allLoans[loanNumber-1]);
                    break;
                case 4:
                    System.out.println(allLoans[loanNumber-1]);
                    break;
                case 5:
                    System.out.println(allLoans[loanNumber-1]);
                    break;
                default:
                    System.out.println("Please enter one of the loan numbers from above!");
                    break;
            }
        } else {
            System.out.println("Thank you have a nice day!");
        }

    }
    public static double percentCalculator(double givenPercent){
        double result;
        result = givenPercent * .01;
        return result;
    }

}
