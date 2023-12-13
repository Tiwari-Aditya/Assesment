import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    String studentName;
    double percentage;
    String department;

    public Student(String studentName, double percentage, String department) {
        this.studentName = studentName;
        this.percentage = percentage;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", percentage=" + percentage +
                ", department='" + department + '\'' +
                '}';
    }
}

public class StudentSorting {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        
        students.add(new Student("Abhishek", 75.50, "BFS"));
        students.add(new Student("Ankit", 60.75, "BFS"));
        students.add(new Student("Aman", 80.25, "ECS"));
        students.add(new Student("Rishi", 55.90, "ECS"));

        
        Comparator<Student> byPercentage = new Comparator<Student>() {
                @Override
                public int compare(Student student1, Student student2) {
                 
                return Double.compare(student1.percentage, student2.percentage);
         }
        };


    Collections.sort(students, byPercentage);

        
        for (Student student : students) {
            System.out.println(student);
        }

}
