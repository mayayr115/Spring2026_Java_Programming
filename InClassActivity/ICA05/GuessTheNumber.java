package InClassActivity.ICA05;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    Random rand = new Random();
    // Bound (inclusive) + starting number (inclusive) = 10 + 1 = range[1, 10]
    int randomNum = rand.nextInt(10) + 1;
    int userNum;

    System.out.println("Welcome to 'Guess the Number'!");
    System.out.println("I'm thinking of a number between 1 and 10.");
    
    do { 
      System.out.print("Enter your guess: ");
      userNum = scnr.nextInt();
      if (userNum == randomNum) System.out.println("Congratulations! You guessed the right number!");
      else {
        try {
          if (scnr.hasNextInt()) {
            System.out.println("Try again!");
          }
        } catch (InputMismatchException npe) {
          System.err.println("Error: That's not a valid number. Please enter an integer.");
        }

        try {
          if (userNum >= 1 && userNum <= 10) {
            System.out.println("Try again!");
          }
        } catch (IllegalArgumentException npe) {
          System.err.println("Error: Please guess a number between 1 and 10.");
        }
      }

      // try {
      //   if (scnr.hasNextInt() && userNum >= 1 && userNum <= 10) System.out.printf("Try again!%n%n");
      // } catch (InputMismatchException npe) {
      //   System.err.println("Error: That's not a valid number. Please enter an integer.");
      // } catch (IllegalArgumentException npe) {
      //   System.err.println("Error: Please guess a number between 1 and 10.");
      // }
    } while (userNum != randomNum);

  }
}
