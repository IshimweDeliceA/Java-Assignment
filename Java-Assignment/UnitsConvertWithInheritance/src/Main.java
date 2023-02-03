import java.util.Scanner;

abstract class UnitConverter {
    abstract double convert(double input);
}

class MeterToFeet extends UnitConverter {
    @Override
    double convert(double input) {
        return input * 3.28084;
    }
}

class CelsiusToFahrenheit extends UnitConverter {
    @Override
    double convert(double input) {
        return (input * 9 / 5) + 32;
    }
}

class KilogramToPound extends UnitConverter {
    @Override
    double convert(double input) {
        return input * 2.20462;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1. Length");
        System.out.println("2. Temperature");
        System.out.println("3. Weight");
        System.out.print("Enter your choice: ");
        int choice = scan.nextInt();

        System.out.print("Enter input: ");
        double input = scan.nextDouble();

        UnitConverter converter;
        switch (choice) {
            case 1:
                converter = new MeterToFeet();
                System.out.println(input + " meters is equal to " + converter.convert(input) + " feet");
                break;
            case 2:
                converter = new CelsiusToFahrenheit();
                System.out.println(input + " degree Celsius is equal to " + converter.convert(input) + " degree Fahrenheit");
                break;
            case 3:
                converter = new KilogramToPound();
                System.out.println(input + " kilograms is equal to " + converter.convert(input) + " pounds");
                break;
            default:
                System.out.println("Invalid choice. Try again.");
        }
    }
}
//the UnitConverter class is declared as an abstract class, which means that it cannot be instantiated as an object. Instead, the MeterToFeet, CelsiusToFahrenheit, and KilogramToPound classes extend UnitConverter and implement the convert method, which performs the actual conversion.