package Project01;

import java.util.Scanner;

public class DrawingShapes {
  public static void main(String[] args){
    // Added Scanner Variable
    Scanner scnr = new Scanner(System.in);

    // Initialized Loop Variables
    int i;
    int j;

    // User inputs a character (Shape Type)
    System.out.println("Enter a shape: r t h o p");
    // To ensure compatible data types (char)
    char Shape = scnr.next().charAt(0);

    // Checks if user input for shape type is r, t, h, o, or p
    if ((Shape == 'r') | (Shape == 't') | (Shape == 'h') | (Shape == 'o') | (Shape == 'p')) {
      System.out.println("Enter a length: ");
      int Len = scnr.nextInt();

      // Checks if user input for side length is greater than 1
      if (Len > 1) {
        switch (Shape) {
          case 'r' -> {
            System.out.println("Enter a height: ");
            int Hei = scnr.nextInt();

            // Checks if user input for rectangle height is greater than 1
            if (Hei > 1) {
              System.out.printf("Below is a %d by %d rectangle of * %n", Len, Hei);

              for (i = 0; i < Hei; i++) {
                for (j = 0; j < Len; j++) {
                  System.out.printf("*");
                }
                System.out.println();
              }
            }
            else System.out.printf("Height must be greater than 1%nGoodbye!%n");
          }
          case 't' -> {
            System.out.printf("Below is a triangle with two side lengths of %d *%n", Len);
            
          }
          case 'h' -> {
            System.out.printf("Below is a hexagon with side lengths of %d *%n", Len);
          }
          case 'o' -> {
            System.out.printf("Below is an octagon with side lengths of %d *%n", Len);
          }
          case 'p' -> {
            System.out.printf("Below is a pentagon with 4 side lengths of %d *%n", Len);
          }
        }
      }
      else System.out.printf("Length must be greater than 1%nGoodbye!%n");
    }
    else System.out.printf("Invalid shape%nGoodbye!%n");
  }
}
