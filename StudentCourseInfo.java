class Student {
    String name;
    int age;
    String dob;

    Student(String name, int age, String dob) {
        this.name = name;
        this.age = age;
        this.dob = dob;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("DOB: " + dob);
    }
}

class Course {
    void display() {
        System.out.println("Maths: 22");
        System.out.println("BDA: 30");
        System.out.println("DevOps: 26");
    }
}

public class StudentCourseInfo {
    public static void main(String[] args) {
        Student s1 = new Student("Shahida", 19, "2005-10-20");
        Course c1 = new Course();
        s1.show();
        c1.display();
    }
}
