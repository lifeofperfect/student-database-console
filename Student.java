package studentDatabaseApp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourses = 600;
    private int id=1000;


    // constructor prompt user for name
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name");
        this.firstName = in.nextLine();

        System.out.println("Enter students last name");
        this.lastName = in.nextLine();

        System.out.println("1- Freshman\n2- Sophomore\n3- Junior\n4- Senior\nEnter student class: ");
        this.gradeYear = in.nextInt();

        setStudentId();

        System.out.println(firstName+" "+lastName+"\n"+gradeYear+"\n StudentID: "+studentID);
    }

    // generate an Id
    public void setStudentId() {
        id++;
        this.studentID = gradeYear+""+id;
    }

    // Enroll incourses
    public void enrol() {
        do{
            System.out.print("Enter yor prefrred courses or Q to quit: ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();

            if(!course.equals("Q")) {
                this.courses = courses+"\n"+course;
                this.tuitionBalance = tuitionBalance+costOfCourses;

            }
            else {
                break;
            }
        }while(5>1);
        System.out.println("Enrolled course: "+courses);

    }

    //view balance
    public void viewBalance() {
        System.out.println("Your balance is: $"+tuitionBalance);
    }
    // pay tuition
    public void payTuition() {
        viewBalance();
        System.out.print("Enter your payment: ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        this.tuitionBalance = tuitionBalance-payment;
        System.out.println("Thank you for payment of: $"+payment);
        viewBalance();
    }
    //show status
    public void showStatus() {
        System.out.println("Name: "+firstName+" "+lastName+"\nGrade level: "+gradeYear+
                "\nStudent ID: "+studentID+"\nCourses: "+" "+courses+"\nBalance: $"+tuitionBalance);
    }
}
