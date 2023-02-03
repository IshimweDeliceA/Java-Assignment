import java.util.ArrayList;
import java.util.Scanner;

class Task {
    private String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskName() {
        return taskName;
    }
}

class TaskManager {
    private ArrayList<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<Task>();
    }

    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("Task added: " + task.getTaskName());
    }

    public void removeTask(Task task) {
        tasks.remove(task);
        System.out.println("Task removed: " + task.getTaskName());
    }

    public void displayTasks() {
        System.out.println("Tasks:");
        for (Task task : tasks) {
            System.out.println("- " + task.getTaskName());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TaskManager manager = new TaskManager();

        while (true) {
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Display Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String taskName = scan.next();
                    Task task = new Task(taskName);
                    manager.addTask(task);
                    break;
                case 2:
                    System.out.print("Enter task name: ");
                    taskName = scan.next();
                    task = new Task(taskName);
                    manager.removeTask(task);
                    break;
                case 3:
                    manager.displayTasks();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
//    Task is a class and task is an object of the Task class. Similarly, TaskManager is a class and manager is an object of the TaskManager class.