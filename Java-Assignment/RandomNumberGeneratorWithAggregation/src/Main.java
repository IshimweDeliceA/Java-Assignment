import java.util.Random;
import java.util.Scanner;

class RandomNumberGenerator {
    private int lowerBound;
    private int upperBound;
    private Random random = new Random();

    RandomNumberGenerator(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    int generate() {
        return lowerBound + random.nextInt(upperBound - lowerBound + 1);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter lower bound: ");
        int lowerBound = scan.nextInt();

        System.out.print("Enter upper bound: ");
        int upperBound = scan.nextInt();

        System.out.print("Enter number of random numbers to generate: ");
        int count = scan.nextInt();

        RandomNumberGenerator generator = new RandomNumberGenerator(lowerBound, upperBound);
        for (int i = 0; i < count; i++) {
            System.out.println(generator.generate());
        }
    }
}
// the RandomNumberGenerator class is declared as an independent class and is used by the Main class to generate random numbers within a specified range.
//  The RandomNumberGenerator class contains a lowerBound and upperBound instance variables, which determine the range of numbers to generate, and a random instance variable, which is an instance of the java.util.Random class, used to generate random numbers.