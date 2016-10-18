/**
 * Created by Rana on 10/17/2016.
 */
public class Main {

    /*
    Prints out a form letter with calculated mortgage payment amounts.
     */
    public static void main (String[] args){
        double interestRate;
        interestRate = 3.5;


        System.out.println("Greetings! Hello Rana...");
        System.out.println();
        System.out.println("If you like low, low mortgage payments, ");
        System.out.println("I have an opportunity you will LOVE.");

        System.out.println("Interest rates have fallen to "+ interestRate + "%.");

        int principal = 125000; //in dollars
        int numberOfYears = 30;
        int numberOfPayments = numberOfYears *12;
        double monthlyRate = interestRate /12/100; // Convert from percentage.

        double monthlyPayment = principal * (monthlyRate / (1 - Math.pow(1+ monthlyRate,-numberOfPayments)));
        System.out.format("You could pay as little as $%.2f a month for a 30 year mortgage.\n", monthlyPayment);
        double totalCost = monthlyPayment * numberOfPayments;
        System.out.format("(Total costs: $%.2f )\n\n", totalCost);

        numberOfYears = 15;
        numberOfPayments = numberOfYears *12;
        monthlyPayment = principal * (monthlyRate / (1 - Math.pow(1+ monthlyRate,-numberOfPayments)));
        System.out.format("You could pay as little as $%.2f a month for a 15 year mortgage.\n", monthlyPayment);
        totalCost = monthlyPayment * numberOfPayments;
        System.out.format("(Total costs: $%.2f )\n\n", totalCost);

        System.out.println();

        double futureInterestRate =2.5;
        System.out.println("Could they fall to "+futureInterestRate+" %?");
        System.out.println("Of course not! You should refinance immediately!");
    }
}
