package pricecalculator;

import java.util.Scanner;

/**
 *
 * @author Jacques-Conrad Calagui-Painchaud
 */
public class PriceCalculator {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        // RECEIVE USER-INPUT PRICE AND DISCOUNT
        System.out.print("Please enter the item price: ");
        double originalPrice = scanner.nextDouble();

        System.out.print("Please enter the discount ratio (5 for 5%): ");
        double discount = scanner.nextDouble();

        // CALCULATE PRICES USING USER INPUTS
        double priceBeforeTax = originalPrice * (1 - discount / 100);
        double federalTax = 0.05 * priceBeforeTax;
        double provincialTax = 0.09975 * priceBeforeTax;
        double finalPrice = originalPrice + federalTax + provincialTax;

        // PRINT POST-CALCULATION PRICES
        System.out.println();
        System.out.printf("%-17s: %.2f%n", "Original price", originalPrice);
        System.out.printf("%-17s: %.2f%%%n", "Discount ratio", discount);
        System.out.printf("%-17s: %.2f%n", "Price before tax", priceBeforeTax);

        System.out.printf("%s%n", new String(new char[30]).replace('\0', '-')); // SEPARATION LINE

        System.out.printf("%-17s: %.2f%n", "Federal tax", federalTax);
        System.out.printf("%-17s: %.2f%n", "Provincial tax", provincialTax);
        System.out.printf("%-17s: %.2f%n", "Final price", finalPrice);
    }
}

