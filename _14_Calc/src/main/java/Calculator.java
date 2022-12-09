import java.util.Scanner; // Import the Scanner class

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble(); // Read the first number from the user

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble(); // Read the second number from the user

        System.out.println("Enter the operation (+, -, *, /):");
        String operation = scanner.next(); // Read the operation from the user

        double result = 0; // Initialize the result variable

        // Perform the specified operation on the two numbers
        if (operation.equals("+")) {
            result = num1 + num2;
        } else if (operation.equals("-")) {
            result = num1 - num2;
        } else if (operation.equals("*")) {
            result = num1 * num2;
        } else if (operation.equals("/")) {
            result = num1 / num2;
        }

        System.out.println("Result: " + result); // Print the result
    }
}

