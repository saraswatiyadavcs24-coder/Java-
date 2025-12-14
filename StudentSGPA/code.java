import java.util.Scanner;


class Subject {
    int subjectMarks;
    int credits;
    int grade;
}


class Student {
    String name;
    String usn;
    double SGPA;
    Scanner s;
    Subject subject[];

    Student() {
        s = new Scanner(System.in);
        subject = new Subject[8];
        for (int i = 0; i < 8; i++) {
            subject[i] = new Subject();
        }
    }

    void getStudentDetails() {
        System.out.print("Enter Student Name: ");
        name = s.nextLine();
        System.out.print("Enter USN: ");
        usn = s.nextLine();
    }

    void getMarks() {
        for (int i = 0; i < 8; i++) {
            System.out.println("Subject " + (i + 1) + ":");
            while (true) {
                System.out.print("Enter marks (0 to 100): ");
                subject[i].subjectMarks = s.nextInt();
                if (subject[i].subjectMarks > 100) {
                    System.out.println("Marks cannot be more than 100. Please re-enter.");
                } else if (subject[i].subjectMarks < 0) {
                    System.out.println("Marks cannot be negative. Please re-enter.");
                } else {
                    break;
                }
            }
            System.out.print("Enter credits: ");
            subject[i].credits = s.nextInt();

            subject[i].grade = (subject[i].subjectMarks / 10) + 1;

            if (subject[i].grade == 11) {
                subject[i].grade = 10;
            }
            if (subject[i].subjectMarks < 40) {
                subject[i].grade = 0;
            }
        }
        s.nextLine(); 
    }

    void computeSGPA() {
        int effectiveScore = 0;
        int totalCredits = 0;

        for (int i = 0; i < 8; i++) {
            effectiveScore += (subject[i].grade * subject[i].credits);
            totalCredits += subject[i].credits;
        }
        SGPA = (double) effectiveScore / (double) totalCredits;
    }

    void display() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("USN: " + usn);
        System.out.printf("SGPA: %.2f\n", SGPA);
    }
}

public class StudentSGPA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            students[i] = new Student();
            students[i].getStudentDetails();
            students[i].getMarks();
            students[i].computeSGPA();
        }

        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < n; i++) {
            students[i].display();
        }

        scanner.close();
    }
}
        
