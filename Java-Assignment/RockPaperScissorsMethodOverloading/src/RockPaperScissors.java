import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to play against the computer or another player? (1 or 2)");
        int choice = input.nextInt();
        if (choice == 1) {
            playAgainstComputer();
        } else {
            playAgainstPlayer();
        }
    }

    public static void playAgainstComputer() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Rock, Paper, or Scissors:");
        String playerChoice = input.nextLine();
        int computerChoice = (int) (Math.random() * 3 + 1);
        String computerChoiceString;
        if (computerChoice == 1) {
            computerChoiceString = "Rock";
        } else if (computerChoice == 2) {
            computerChoiceString = "Paper";
        } else {
            computerChoiceString = "Scissors";
        }
        System.out.println("Computer chose " + computerChoiceString);
        whoWins(playerChoice, computerChoiceString);
    }

    public static void playAgainstPlayer() {
        Scanner input = new Scanner(System.in);
        System.out.println("Player 1: Enter Rock, Paper, or Scissors:");
        String player1Choice = input.nextLine();
        System.out.println("Player 2: Enter Rock, Paper, or Scissors:");
        String player2Choice = input.nextLine();
        whoWins(player1Choice, player2Choice);
    }

    public static void whoWins(String player1Choice, String player2Choice) {
        if (player1Choice.equals(player2Choice)) {
            System.out.println("It's a tie!");
        } else if (player1Choice.equals("Rock")) {
            if (player2Choice.equals("Scissors")) {
                System.out.println("Player 1 wins!");
            } else {
                System.out.println("Player 2 wins!");
            }
        } else if (player1Choice.equals("Paper")) {
            if (player2Choice.equals("Rock")) {
                System.out.println("Player 1 wins!");
            } else {
                System.out.println("Player 2 wins!");
            }
        } else if (player1Choice.equals("Scissors")) {
            if (player2Choice.equals("Paper")) {
                System.out.println("Player 1 wins!");
            } else {
                System.out.println("Player 2 wins!");
            }
        }
    }
}
