package balancecalculator;

import java.util.Scanner;

/**
 *
 * @author Jacques-Conrad Calagui-Painchaud
 */
public class BalanceCalculator {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        // RECEIVE USER FINANCIAL DATA
        System.out.print("Please enter the initial balance: ");
        double initialBalance = scanner.nextDouble();

        System.out.print("Please enter the annual interest rate (2 for 2%): ");
        double annualInterest = scanner.nextDouble();

        System.out.print("Please enter the number of years  the client wants to save the money in the bank: ");
        int yearsInBank = scanner.nextInt();

        // CALCULATE FINANCIAL DATA USING USER INPUTS
        double moneyAfterInterest = initialBalance * Math.pow(1 + annualInterest / 100, yearsInBank);

        // PRINT USER-INPUTTED AND POST-CALCULATION FINANCIAL DATA
        System.out.println();
        System.out.printf("%-24s: %8.2f%n", "Initial balance", initialBalance);
        System.out.printf("%-24s: %7.2f%%%n", "Annual interest rate", annualInterest);
        System.out.printf("%-24s: %8d%n", "Saving years", yearsInBank);

        System.out.printf("%s%n", new String(new char[34]).replace('\0', '-')); // SEPARATION LINE

        String entryTitle = "Balance after " + yearsInBank + " years";
        System.out.printf("%-24s: %8.2f%n", entryTitle, moneyAfterInterest);
    }
}

