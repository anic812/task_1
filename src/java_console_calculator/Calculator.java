package java_console_calculator;

import java.util.Scanner;

public class Calculator {
    // Scanner class for user input
    Scanner scanner = new Scanner(System.in);
    
    // Mathematical operations methods
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {throw new ArithmeticException("Cannot divide by zero!");}
        return a / b;
    }

    // Display menu
    private void displayMenu() {
        System.out.println("\n=== Calculator Menu ===");
        System.out.println("1. Addition (+)\n2. Subtraction (-)\n3. Multiplication (*)\n4. Division (/)\n5. Exit");
        System.out.print("Select option (1-5): ");
    }

    // Get menu choice
    private int getMenuChoice() {
        while (true) {
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                if (choice >= 1 && choice <= 5) {
                    return choice;
                } else {
                    System.out.print("Invalid choice! Enter a number between 1 and 5: ");
                }
            } else {
                System.out.print("Invalid input! Enter a number between 1 and 5: ");
                scanner.next(); // for invalid input
            }
        }
    }

    // Get numbers input from user
    private double getNumber(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.print("Invalid input! Enter a valid number: ");
                scanner.next(); // for invalid input
            }
        }
    }

    // Simple formatting - show integers without decimals, doubles with decimals
    private String formatNumber(double value) {
        if (value == (long) value) {
            return String.valueOf((long) value); // Show as integer
        } else {
            return String.format("%.2f", value); // Show as decimal
        }
    }

    // Perform calculation
    private double performOperation(int choice, double a, double b) {
        switch (choice) {
            case 1:
                return add(a, b);
            case 2:
                return subtract(a, b);
            case 3:
                return multiply(a, b);
            case 4:
                return divide(a, b);
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }

    // Get formatted operation name and symbol to display
    private String getOperationName(int choice) {
        String[] operations = { "Addition", "Subtraction", "Multiplication", "Division" };
        return operations[choice - 1];
    }

    private String getOperationSymbol(int choice) {
        String[] symbols = { " + ", " - ", " * ", " / " };
        return symbols[choice - 1];
    }

    // Ask if the user wants to continue
    private boolean shouldContinue() {
        System.out.print("\nContinue? (y/n): ");
        String input = scanner.next().toLowerCase();
        return input.equals("y");
    }

    // Main calculator logic
    public void run() {
        System.out.println("\n=== Java Console Calculator ===");
        boolean running = true;
        while (running) {
            displayMenu();
            int choice = getMenuChoice();
            if (choice == 5) {
                System.out.println("Exiting from the calculator.");
                break;
            }
            try {
                double firstNumber = getNumber("\nFirst number: ");
                double secondNumber = getNumber("Second number: ");

                double result = performOperation(choice, firstNumber, secondNumber);

                // Display result
                System.out.printf("\n%s Result: %s%s%s = %s%n",
                        getOperationName(choice),
                        formatNumber(firstNumber),
                        getOperationSymbol(choice),
                        formatNumber(secondNumber),
                        formatNumber(result));

                running = shouldContinue();

            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
                running = shouldContinue();
            }
        }
        System.out.println("Exiting from the calculator.");
        scanner.close();
    }

    public static void main(String[] args) {
        new Calculator().run();
    }
}