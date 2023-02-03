import java.util.Scanner;

class Calculator {
    public static double add(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        return x / y;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double x = scan.nextDouble();

        System.out.print("Enter second number: ");
        double y = scan.nextDouble();

        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Enter your choice: ");
        int choice = scan.nextInt();

        double result;
        switch (choice) {
            case 1:
                result = Calculator.add(x, y);
                System.out.println("Result: " + result);
                break;
            case 2:
                result = Calculator.subtract(x, y);
                System.out.println("Result: " + result);
                break;
            case 3:
                result = Calculator.multiply(x, y);
                System.out.println("Result: " + result);
                break;
            case 4:
                result = Calculator.divide(x, y);
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Invalid choice. Try again.");
        }
    }
}

//the static keyword is used to declare the methods add, subtract, multiply, and divide in the Calculator class. By declaring these methods as static, we can access them directly from the class, without having to create an instance of the class. This allows us to use these methods to perform arithmetic operations in the main method of the Main class, without having to create a Calculator object