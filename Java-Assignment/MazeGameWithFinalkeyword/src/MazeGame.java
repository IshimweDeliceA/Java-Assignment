import java.util.Scanner;

public class MazeGame {
    private static final int EASY = 1;
    private static final int MEDIUM = 2;
    private static final int HARD = 3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your level of difficulty:");
        System.out.println("1. Easy");
        System.out.println("2. Medium");
        System.out.println("3. Hard");
        int difficulty = sc.nextInt();

        switch (difficulty) {
            case EASY:
                System.out.println("You have chosen easy level.");
                break;
            case MEDIUM:
                System.out.println("You have chosen medium level.");
                break;
            case HARD:
                System.out.println("You have chosen hard level.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}

//the final keyword is used to declare constant integers for the levels of difficulty in the game. These values can be used throughout the code and cannot be changed, as they are final. The user is prompted to choose their level of difficulty and the program outputs the corresponding message using a switch statement.