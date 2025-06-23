# Java Console Calculator
A simple, command-line based calculator written in Java. This application provides a menu-driven interface for performing basic arithmetic operations.

## Features

*   **Four Basic Operations**: Supports Addition, Subtraction, Multiplication, and Division.
*   **Menu-Driven Interface**: Easy-to-navigate menu for selecting operations.
*   **Input Validation**: Ensures that user input for menu choices and numbers is valid.
*   **Error Handling**: Gracefully handles errors like division by zero.
*   **Continuous Calculations**: Option to perform multiple calculations without restarting the program.
*   **Smart Formatting**: Displays results as integers if they are whole numbers, and as decimals (to two places) otherwise.

## Prerequisites

*   Java Development Kit (JDK) installed and configured on your system.

## How to Run

1.  **Clone the repository:**
    ```sh
    git clone https://github.com/anic812/task_1.git
    cd task_1
    ```

2.  **Navigate to the source directory:**
    ```sh
    cd src
    ```

3.  **Compile the Java code:**
    ```sh
    javac java_console_calculator/Calculator.java
    ```

4.  **Run the application:**
    ```sh
    java java_console_calculator.Calculator
    ```

## Usage Example

Once the application is running, you will be greeted with the main menu.

```
=== Java Console Calculator ===

=== Calculator Menu ===
1. Addition (+)
2. Subtraction (-)
3. Multiplication (*)
4. Division (/)
5. Exit
Select option (1-5): 1

First number: 10
Second number: 5

Addition Result: 10 + 5 = 15

Continue? (y/n): y

=== Calculator Menu ===
1. Addition (+)
2. Subtraction (-)
3. Multiplication (*)
4. Division (/)
5. Exit
Select option (1-5): 4

First number: 20
Second number: 3

Division Result: 20 / 3 = 6.67

Continue? (y/n): n
Exiting from the calculator.
