package Project01;

import java.util.Scanner;

public class DrawingShapes {
  public static void main(String[] args){
    Scanner scnr = new Scanner(System.in);
    int i;
    int j;

    System.out.println("Enter a shape: r t h o p");
    char Shape = scnr.next().charAt(0);;

    if ((Shape == 'r') | (Shape == 't') | (Shape == 'h') | (Shape == 'o') | (Shape == 'p')) {
      System.out.println("Enter a length: ");
      int Len = scnr.nextInt();

      if (Len > 1) {
        switch (Shape) {
          case 'r' -> {
            System.out.println("Enter a height: ");
            int Hei = scnr.nextInt();

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
          case 't' -> System.out.printf("Below is a triangle with two side lengths of %d *%n", Len);
          case 'h' -> System.out.printf("Below is a hexagon with side lengths of %d *%n", Len);
          case 'o' -> System.out.printf("Below is an octagon with side lengths of %d *%n", Len);
          case 'p' -> System.out.printf("Below is a pentagon with 4 side lengths of %d *%n", Len);
        }
      }
      else System.out.printf("Length must be greater than 1%nGoodbye!%n");
    }
    else System.out.printf("Invalid shape%nGoodbye!%n");
  }
}
