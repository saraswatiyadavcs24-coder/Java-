package SEE;

import CIE.Internals;
import java.util.Scanner;

public class Externals extends Internals {

    protected int seeMarks[];
    protected int finalMarks[];

    public Externals() {
        seeMarks = new int[5];
        finalMarks = new int[5];
    }

    public void inputSEEmarks() {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter SEE Marks for 5 subjects:");

        for (int i = 0; i < 5; i++) {
            System.out.print("SEE Mark for subject " + (i + 1) + ": ");
            seeMarks[i] = s.nextInt();
        }
    }

    public void calculateFinalMarks() {
        for (int i = 0; i < 5; i++) {
            // CIE out of 50, SEE out of 100, so SEE/2
            finalMarks[i] = cieMarks[i] + (seeMarks[i] / 2);
        }
    }

    public void displayFinalMarks() {
        System.out.println("\n----- Final Marks Report -----");
        displayStudentDetails();

        for (int i = 0; i < 5; i++) {
            System.out.println("Final Marks (Subject " + (i + 1) + "): " + finalMarks[i]);
        }
        System.out.println();
    }
}
