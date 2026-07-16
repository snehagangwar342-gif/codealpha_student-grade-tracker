import java.util.ArrayList;

public class GradeTracker {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("No Student Records Found.");
            return;
        }

        System.out.println("\nID\tName\tMarks\tGrade");

        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void highestScore() {

        if (students.isEmpty()) return;

        Student highest = students.get(0);

        for (Student s : students) {
            if (s.getMarks() > highest.getMarks()) {
                highest = s;
            }
        }

        System.out.println("\nHighest Score");
        System.out.println(highest);
    }

    public void lowestScore() {

        if (students.isEmpty()) return;

        Student lowest = students.get(0);

        for (Student s : students) {
            if (s.getMarks() < lowest.getMarks()) {
                lowest = s;
            }
        }

        System.out.println("\nLowest Score");
        System.out.println(lowest);
    }

    public void averageScore() {

        if (students.isEmpty()) return;

        double sum = 0;

        for (Student s : students) {
            sum += s.getMarks();
        }

        System.out.println("\nAverage Score : " + (sum / students.size()));
    }
}