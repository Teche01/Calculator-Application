import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Arithmetic Calculator!");

        while (true) {
            System.out.print("Enter the first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = sc.nextDouble();

            System.out.println("Choose an operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.print("Enter your choice (1-4): ");
            int choice = sc.nextInt();

            
            double result = 0.00;

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Division by zero is not allowed.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Invalid choice.");
                    return;
            }

            System.out.println("The result is: " + result);

            System.out.print("Do you want to perform another calculation? (y/n): ");
            char again = sc.next().charAt(0);

            if (again == 'n') {
                System.out.println("Thank you for using the Arithmetic Calculator! Goodbye.");
                break;
            }
        }
        sc.close();
    }
}
