package CIE;

import java.util.Scanner;

public class Internals extends Student {

    protected int cieMarks[] = new int[5];

    public void inputCIEmarks() {
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter CIE Marks for 5 subjects:");

        for (int i = 0; i < 5; i++) {
            System.out.print("CIE Mark for subject " + (i + 1) + ": ");
            cieMarks[i] = s.nextInt();
        }
    }
}
