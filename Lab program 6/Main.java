import SEE.Externals;
import java.util.Scanner;

class Main {

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = s.nextInt();

        Externals students[] = new Externals[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Student " + (i + 1) + " ---");
            students[i] = new Externals();

            students[i].inputStudentDetails();
            students[i].inputCIEmarks();
            students[i].inputSEEmarks();
            students[i].calculateFinalMarks();
        }

        System.out.println("\n========== FINAL MARKS OF ALL STUDENTS ==========\n");

        for (int i = 0; i < n; i++) {
            students[i].displayFinalMarks();
        }
    }
}
