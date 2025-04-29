class Student {
    String name;
    int day, month, year;

    Student(String n, int d, int m, int y) {
        name = n;
        day = d;
        month = m;
        year = y;
    }

    void showAge(int currDay, int currMonth, int currYear) {
        int age = currYear - year;
        if (currMonth < month || (currMonth == month && currDay < day)) {
            age--;
        }
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Student_info {
    public static void main(String[] args) {
        Student s = new Student("Shahida", 20, 10, 2005);
        s.showAge(29, 4, 2025);
    }
}
