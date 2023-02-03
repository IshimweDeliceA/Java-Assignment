import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numGrades, total = 0;
        int[] grades;

        System.out.print("Enter number of grades: ");
        numGrades = sc.nextInt();

        grades = new int[numGrades];

        System.out.println("Enter " + numGrades + " grades:");
        for (int i = 0; i < numGrades; i++) {
            grades[i] = sc.nextInt();
            total += grades[i];
        }

        int average = total / numGrades;

        System.out.println("Enter 1 to display grades, 2 to display average, 3 to display both:");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Grades: ");
                for (int grade : grades) {
                    System.out.print(grade + " ");
                }
                break;
            case 2:
                System.out.println("Average: " + average);
                break;
            case 3:
                System.out.println("Grades: ");
                for (int grade : grades) {
                    System.out.print(grade + " ");
                }
                System.out.println("\nAverage: " + average);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}