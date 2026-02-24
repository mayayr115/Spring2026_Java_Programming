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
          // Draws Rectangle
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
          // Draws Triangle
          case 't' -> {
            System.out.printf("Below is a triangle with two side lengths of %d *%n", Len);
            int tSide = 1;
            for (i = 1; i <= Len; i++) {
              for (j = 0; j < Len - i; j++) {
                System.out.printf(" ");
              }
              for (j = 0; j < tSide; j++) {
                System.out.printf("*");
              }
              System.out.println();
              tSide += 2;
            }
          }
          // Draws Hexagon
          case 'h' -> {
            System.out.printf("Below is a hexagon with side lengths of %d *%n", Len);
            int hSide = Len;
            // Top half
            for (i = 1; i <= Len; i++) {
              for (j = 0; j < Len - i; j++) {
                System.out.printf(" ");
              }
              for (j = 0; j < hSide; j++) {
                System.out.printf("*");
              }
              System.out.println();
              hSide += 2;
            }
            hSide -= 2;

            // Bottom half
            for (i = Len - 1; i >= 1; i--) {
              hSide -= 2;
              for (j = 0; j < Len - i; j++) {
                System.out.printf(" ");
              }
              for (j = 0; j < hSide; j++) {
                System.out.printf("*");
              }
              System.out.println();
            }
          }
          // Draws Octagon
          case 'o' -> {
            System.out.printf("Below is an octagon with side lengths of %d *%n", Len);
            int oSide = Len;
            // Top half (Trapezoid)
            for (i = 1; i <= Len; i++) {
              for (j = 0; j < Len - i; j++) {
                System.out.printf(" ");
              }
              for (j = 0; j < oSide; j++) {
                System.out.printf("*");
              }
              System.out.println();
              oSide += 2;
            }
            // Middle (Rectangle)
            for (i = 0; i < Len - 1; i++) {
              for (j = 0; j < oSide - 2; j++) {
                System.out.printf("*");
              }
              System.out.println();
            }
            oSide -= 2;

            // Bottom Half
            for (i = Len - 1; i >= 1; i--) {
              oSide -= 2;
              for (j = 0; j < Len - i; j++) {
                System.out.printf(" ");
              }
              for (j = 0; j < oSide; j++) {
                System.out.printf("*");
              }
              System.out.println();
            }
          }
          // Draws Pentagon
          case 'p' -> {
            System.out.printf("Below is a pentagon with 4 side lengths of %d *%n", Len);
            // Top part of Pentagon (Triangle)
            int pSide = 1;
            for (i = 1; i <= Len; i++) {
              for (j = 0; j < Len - i; j++) {
                System.out.printf(" ");
              }
              for (j = 0; j < pSide; j++) {
                System.out.printf("*");
              }
              System.out.println();
              pSide += 2;
            }

            // Bottom part of Pentagon (Rectangle)
            for (i = 0; i < Len - 1; i++) {
              for (j = 0; j < pSide - 2; j++) {
                System.out.printf("*");
              }
              System.out.println();
            }
          }
        }
      }
      else System.out.printf("Length must be greater than 1%nGoodbye!%n");
    }
    else System.out.printf("Invalid shape%nGoodbye!%n");
  }
}
