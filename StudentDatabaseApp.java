package studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        //Ask how many users will be created
        System.out.println("Enter numbr of students");
        Scanner in = new Scanner(System.in);
        int numberOfStudents = in.nextInt();

        Student[] students = new Student[numberOfStudents];

        for(int n=0; n<numberOfStudents;n++) {
            students[n] = new Student();
            students[n].enrol();
            students[n].payTuition();
            students[n].showStatus();
        }

        for(int n=0; n<numberOfStudents; n++) {
            students[n].showStatus();

        }
        // create n number of users
    }
}
