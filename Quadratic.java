import java.util.Scanner;



public class Quadratic {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        System.out.print("Enter a, b, c: ");

        double a = input.nextDouble();

        double b = input.nextDouble();

        double c = input.nextDouble();



        if (a == 0) {

            System.out.println("This is not a quadratic equation.");

        } else {



            double discriminant = (b * b) - (4 * a * c);



            if (discriminant > 0) {

                // Two real roots

                double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);

                double r2 = (-b - Math.sqrt(discriminant)) / (2 * a);

                System.out.printf("x1=%.4f, x2=%.4f\n", r1, r2);

            } 

            else if (discriminant == 0) {

                // One real root

                double r = -b / (2 * a);

                System.out.printf("x=%.4f\n", r);

            } 

            else {

                // No real roots

                System.out.println("No real solution");

            }

        }

        

        input.close();

    }

}