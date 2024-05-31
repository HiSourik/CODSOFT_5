import java.util.Scanner;

public class StudentManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Student student = new Student();
        
        System.out.println("Enter the student's name: ");
        student.setName(scanner.nextLine());

        System.out.println("Enter the student's age: ");
        student.setAge(scanner.nextInt());

        System.out.println("Enter the student's grade level: ");
        student.setGradeLevel(scanner.nextInt());
        
        System.out.println("Student name: " + student.getName());
        System.out.println("Student age: " + student.getAge());
        System.out.println("Student grade level: " + student.getGradeLevel());
    }
}

class Student {

    private String name;
    private int age;
    private int gradeLevel;

    public Student() {
    }

    public Student(String name, int age, int gradeLevel) {
        this.name = name;
        this.age = age;
        this.gradeLevel = gradeLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
}