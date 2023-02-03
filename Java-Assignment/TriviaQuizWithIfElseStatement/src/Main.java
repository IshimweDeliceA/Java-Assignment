import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
class Question {
    private String question;
    private String answer;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}

class Quiz {
    private List<Question> questions;

    public Quiz(List<Question> questions) {
        this.questions = questions;
    }

    public int askQuestions() {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        for (Question question : questions) {
            System.out.println(question.getQuestion());
            String answer = sc.nextLine();
            if (answer.equals(question.getAnswer())) {
                score++;
            }
        }
        return score;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose subject: ");
        System.out.println("1. History");
        System.out.println("2. Science");
        System.out.println("3. Mathematics");
        int subject = sc.nextInt();
        List<Question> questions;
        if (subject == 1) {
            questions = Arrays.asList(
                    new Question("Who was the first President of the United States?", "George Washington"),
                    new Question("When did the American Civil War take place?", "1861-1865"),
                    new Question("Who discovered America?", "Christopher Columbus")
            );
        } else if (subject == 2) {
            questions = Arrays.asList(
                    new Question("What is the smallest planet in our solar system?", "Mercury"),
                    new Question("What is the process by which plants make their own food?", "Photosynthesis"),
                    new Question("What is the chemical formula for water?", "H2O")
            );
        } else if (subject == 3) {
            questions = Arrays.asList(
                    new Question("What is the sum of the first ten positive integers?", "55"),
                    new Question("What is the square root of 144?", "12"),
                    new Question("What is the equation of a line that passes through the points (2, 3) and (4, 5)?", "y = x + 1")
            );
        } else {
            System.out.println("Invalid subject");
            return;
        }
        Quiz quiz = new Quiz(questions);
        int score = quiz.askQuestions();
        System.out.println("Score: " + score + "/" + questions.size());
    }
}