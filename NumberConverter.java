package numberconverter;

import java.util.Scanner;

/**
 *
 * @author Jacques-Conrad Calagui-Painchaud
 */
public class NumberConverter {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        // RECEIVE USER-INPUT OCTAL NUMBER
        System.out.print("Please enter a 4-digit octal number: ");
        int originalOctalNumber = scanner.nextInt();

        // CALCULATE DECIMAL NUMBER FROM OCTAL NUMBER
        int octalNumber = originalOctalNumber;
        int decimalNumber = 0;

        decimalNumber += (octalNumber % 10) * (int)Math.pow(8, 0); octalNumber /= 10;
        decimalNumber += (octalNumber % 10) * (int)Math.pow(8, 1); octalNumber /= 10;
        decimalNumber += (octalNumber % 10) * (int)Math.pow(8, 2); octalNumber /= 10;
        decimalNumber += (octalNumber % 10) * (int)Math.pow(8, 3);

        // PRINT USER-INPUTTED OCTAL NUMBER AND ITS DECIMAL CONVERSION
        System.out.println();
        System.out.printf("%-15s: %d%n", "Octal number", originalOctalNumber);
        System.out.printf("%-15s: %d%n", "Decimal number", decimalNumber);
    }
}

