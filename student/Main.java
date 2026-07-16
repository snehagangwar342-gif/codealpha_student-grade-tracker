import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GradeTracker tracker = new GradeTracker();

        while (true) {

            System.out.println("\n===== Student Grade Tracker =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Highest Score");
            System.out.println("4. Lowest Score");
            System.out.println("5. Average Score");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    tracker.addStudent(new Student(id, name, marks));

                    System.out.println("Student Added Successfully!");

                    break;

                case 2:
                    tracker.displayStudents();
                    break;

                case 3:
                    tracker.highestScore();
                    break;

                case 4:
                    tracker.lowestScore();
                    break;

                case 5:
                    tracker.averageScore();
                    break;

                case 6:
                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}