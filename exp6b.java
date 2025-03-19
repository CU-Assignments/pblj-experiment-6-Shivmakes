import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    double marks;

    // Constructor
    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    // Getter methods for name and marks
    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return name + ": " + marks + "%";
    }
}

public class StudentFilterSort {
    public static void main(String[] args) {
        // Creating a list of student objects
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 85));
        students.add(new Student("Alice", 92));
        students.add(new Student("Bob", 65));
        students.add(new Student("Charlie", 78));
        students.add(new Student("David", 88));

        // Using stream to filter, sort and display students who scored above 75%
        students.stream()
                .filter(student -> student.getMarks() > 75) // Filter students scoring above 75%
                .sorted(Comparator.comparingDouble(Student::getMarks)) // Sort by marks
                .map(Student::getName) // Extract names of students
                .forEach(System.out::println); // Display the names
    }
}
