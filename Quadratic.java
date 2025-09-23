import java.util.Scanner;

class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a");
        double a = sc.nextDouble();

        System.out.println("enter b");
        double b = sc.nextDouble();

        System.out.println("enter c");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("Not a quadratic equation");
        } else {
            double d = b * b - 4 * a * c;
            double r1, r2;

            if (d == 0) {
                r1 = (-b) / (2 * a);
                System.out.println("Roots are real and equal.");
                System.out.println("Root = " + r1);
            } else if (d > 0) {
                r1 = ((-b) + Math.sqrt(d)) / (2 * a);
                r2 = ((-b) - Math.sqrt(d)) / (2 * a);
                System.out.println("Roots are real and distinct0.");
                System.out.println("Root 1 is " + r1 + " and Root 2 is " + r2);
            } else {
                System.out.println("Roots are imaginary");
                r1 = -b / (2 * a);
                r2 = Math.sqrt(-d) / (2 * a);
                System.out.println("Root 1 is " + r1 + " + " + r2 + "i");
                System.out.println("Root 2 is " + r1 + " - " + r2 + "i");
            }
        }

        sc.close();
    }
}
