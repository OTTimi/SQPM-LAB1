package com.ontariotechu.sofe3980U;
import org.joda.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App 
{
	/**
	* Main program:  The entry point of the program. The local time will be printed first,
	*      Then it will create two binary variables, add them and print the result.
	*
	* @param args: not used
	*/
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Binary Calculator!");
        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. OR");
            System.out.println("2. AND");
            System.out.println("3. Multiply");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                continue;
            }

            if (choice == 4) {
                System.out.println("Exiting the Binary Calculator. Goodbye!");
                break;
            }

            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            System.out.print("Enter the first binary number: ");
            String binary1 = scanner.nextLine();
            if (!isValidBinary(binary1)) {
                System.out.println("Invalid binary number. Please try again.");
                continue;
            }

            System.out.print("Enter the second binary number: ");
            String binary2 = scanner.nextLine();
            if (!isValidBinary(binary2)) {
                System.out.println("Invalid binary number. Please try again.");
                continue;
            }

            Binary bin1 = new Binary(binary1);
            Binary bin2 = new Binary(binary2);
            Binary result;

            switch (choice) {
                case 1:
                    result = bin1.OR(bin2);
                    System.out.println("Result of OR: " + result.getNumber());
                    break;
                case 2:
                    result = bin1.AND(bin2);
                    System.out.println("Result of AND: " + result.getNumber());
                    break;
                case 3:
                    result = bin1.Multiply(bin2);
                    System.out.println("Result of Multiply: " + result.getNumber());
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    /**
     * Helper method to validate a binary number.
     *
     * @param binary The input string to validate.
     * @return True if the input is a valid binary number, otherwise false.
     */
    private static boolean isValidBinary(String binary) {
        return binary.matches("[01]+");
    }
}