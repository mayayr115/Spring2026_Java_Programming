package InClassActivity.ICA05;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    Random rand = new Random();
    int userNum = 0;
    int randomNum = rand.nextInt(10) + 1;

    System.out.println("Welcome to 'Guess the Number'!");
    System.out.println("I'm thinking of a number between 1 and 10.");

    do {
      System.out.print("Enter your guess: ");

      if (!scnr.hasNextInt()) {
        System.out.printf("Error: That's not a valid number. Please enter an integer.%n%n");
        scnr.next(); // discard invalid input

      } else {
        userNum = scnr.nextInt();

        if (userNum < 1 || userNum > 10) {
          System.out.printf("Error: Please guess a number between 1 and 10.%n%n");
        } else if (userNum == randomNum) {
          System.out.printf("Congratulations! You guessed the right number!%n%n");
        } else {
          System.out.printf("Try again!%n%n");
        }
      }

    } while (userNum != randomNum);
  }
}