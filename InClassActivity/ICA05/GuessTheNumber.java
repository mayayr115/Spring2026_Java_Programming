package InClassActivity.ICA05;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    Random rand = new Random();
    int userNum = 0;
    // Bound (inclusive) + starting number (inclusive) = 10 + 1 = range[1, 10]
    int randomNum = rand.nextInt(10) + 1;
    
    System.out.println("Welcome to 'Guess the Number'!");
    System.out.println("I'm thinking of a number between 1 and 10.");
    
    do { 
      System.out.print("Enter your guess: ");
      userNum = scnr.nextInt();

      if (userNum == randomNum) System.out.printf("Congratulations! You guessed the right number!%n%n");

      else if (!(userNum instanceof int)) {
        try {
          throw new InputMismatchException("Error: That's not a valid number. Please enter an integer.");
        } catch (InputMismatchException e) {
          System.out.printf("%s%n%n", e.getMessage());
        } 
      }

      else if (userNum < 1 || userNum > 10) {
        try {
          throw new IllegalArgumentException("Error: Please guess a number between 1 and 10.");
        } catch (IllegalArgumentException e) {
          System.out.printf("%s%n%n", e.getMessage());
        }
      }

      else System.out.printf("Try again!%n%n");
              
    } while (userNum != randomNum);
  }
}
