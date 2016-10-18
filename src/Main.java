/**
 * Created by Rana on 10/17/2016.
 */
public class Main {

    /*
    Prints out a form letter with calculated mortgage payment amounts.
     */
    public static void main (String[] args){
        int creditScore = 850;
        double intrestRate= getInterestRate(creditScore);
        int principal = 125000; //in dollars
        int numberOfYears = 30;
        double futureInterestRate =2.5;
        double futureMonthlyPayment = getMonthlyPayment(principal,futureInterestRate,numberOfYears);
        double monthlyPayment = getMonthlyPayment(principal,intrestRate,numberOfYears);
        String name = "RanaMan";


        printFormLetter(intrestRate, futureInterestRate, futureMonthlyPayment, monthlyPayment, name);
    }

    private static void printFormLetter(double intrestRate, double futureInterestRate, double futureMonthlyPayment, double monthlyPayment, String name) {
        System.out.println("Greetings "+name+"!");
        System.out.println();
        System.out.println("If you like low, low mortgage payments, ");
        System.out.println("I have an opportunity you will LOVE.");
        System.out.println("Interest rates have fallen to "+ intrestRate + "%.");


        System.out.format("You could pay as little as $%.2f a month for a 30 year mortgage.\n", monthlyPayment);


        System.out.println();

        System.out.println("Could they fall to "+futureInterestRate+" %?");
        System.out.format("Could pay as little as $%.2f a month for a 30 year mortgage instead?\n", futureMonthlyPayment);
        System.out.println("Of course not! You should refinance immediately!\n");
    }


    public static double getMonthlyPayment(int principal, double intrestRate, int numberOfYears){
        int numberOfPayments = numberOfYears *12;
        double monthlyRate = intrestRate /12/100; // Convert from percentage.
        double monthlyPayment = principal * (monthlyRate / (1 - Math.pow(1+ monthlyRate,-numberOfPayments)));
        return monthlyPayment;
    }


    public static double getInterestRate (int creditScore){
        double interestRate = 15.0;

        boolean isPerfectScore = creditScore == 850;
        System.out.println("Is my credit score perfect? isPerfectScore:" + isPerfectScore);

        if(isPerfectScore){
            interestRate = 0.25;
        }else if (creditScore >= 800){
            interestRate = 1.5;
        }else if(creditScore >= 700){
            interestRate = 4.75;
        }else{
            interestRate = 10;
        }

        if(!isPerfectScore && creditScore > 500){
            interestRate -=0.5;
        }

        return interestRate;
    }
}
