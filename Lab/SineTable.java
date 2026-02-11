package Lab;

import java.util.Scanner;

/*
Maya Ramkishun
2/10/26
This program takes the array length, first x value, and x increment value from user input to create an array of x and y values.
The y values are calculated using the equation (20.0 * |sin(x)|), and x is calculated by x + increment value.
*/

public class SineTable {
  public static void main(String[] args){
    Scanner scnr = new Scanner(System.in);

    System.out.print("Please enter the number of x values to process: ");
    int N = scnr.nextInt();

    // Ensures N is a positive integer
    if (N > 0) {
      System.out.print("Enter a minimum value for x: ");
      double xMin = scnr.nextDouble();

      System.out.print("Enter the amount to increment x: ");
      double Inc = scnr.nextDouble();

      // Ensures Inc is positive
      if (Inc > 0) {
        double[] x = new double[N];
        x[0] = xMin;

        double[] y = new double[N];
        y[0] = 20.0 * Math.abs(Math.sin(xMin));

        // Initial values of the x and y arrays
        System.out.println("\nValues");
        System.out.printf("x: %.3f, y: %.3f%n", x[0], y[0]);

        for (int i = 1; i < x.length; i++) {
          x[i] = x[i-1] + Inc;
          y[i] = 20.0 * Math.abs(Math.sin(x[i]));
          System.out.printf("x: %.3f, y: %.3f%n", x[i], y[i]);
        }
      }
      else System.out.println("The increment must be a decimal number greater than 0.");
    }
    else System.out.println("The number of x values must be an integer greater than 0.");
  }
}
