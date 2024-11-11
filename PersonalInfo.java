package personalinfo;

import java.util.Scanner;

/**
 *
 * @author Jacques-Conrad Calagui-Painchaud
 */
public class PersonalInfo {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);

        // RECEIVE USER'S PERSONAL INFO
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Please enter your age: ");
        int age = scanner.nextInt(); scanner.nextLine();

        System.out.print("Please enter your gender: ");
        String gender = scanner.nextLine();

        System.out.print("Please enter your department: ");
        String department = scanner.nextLine();

        System.out.print("Please enter the value of pi (3.141592): ");
        double pi = scanner.nextDouble();

        // PRINT USER'S PERSONAL INFO
        System.out.println();
        System.out.printf("%-15s: %s%n", "Name", name);
        System.out.printf("%-15s: %d%n", "Age", age);
        System.out.printf("%-15s: %s%n", "Gender", gender);
        System.out.printf("%-15s: %s%n", "Department", department);
        System.out.printf("%-15s: %.2f%n", "Pi", pi);
    }
}

