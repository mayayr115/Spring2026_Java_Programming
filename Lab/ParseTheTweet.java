package Lab;
import java.util.Scanner;

public class ParseTheTweet {
  public static void main (String[] args) {
    String userTweet;
    
	  System.out.println("Enter a tweet below:");
    Scanner scnr = new Scanner(System.in);
    // userTweet = #typ value; #det value; #loc value; #lat value; #lng value
    userTweet = scnr.nextLine();
    userTweet = userTweet.trim();
    
    int start = userTweet.indexOf("#typ") + 5;
    int finish = userTweet.indexOf(";");
    String typ = userTweet.substring(start, finish).toUpperCase();

    start = userTweet.indexOf("#det") + 5;
    finish = userTweet.indexOf(";", start);
    String det = userTweet.substring(start, finish);

    start = userTweet.indexOf("#loc") + 5;
    finish = userTweet.indexOf(";", start);
    String loc = userTweet.substring(start, finish);

    start = userTweet.indexOf("#lat") + 5;
    finish = userTweet.indexOf(";", start);
    String lat = userTweet.substring(start, finish);

    start = userTweet.indexOf("#lng") + 5;
    finish = userTweet.indexOf(";", start);
    String lng = userTweet.substring(start, finish);

    System.out.println("Type: " + typ);
    System.out.println("Detail: " + det);
    System.out.println("Location: " + loc);
    System.out.println("Latitude: " + lat);
    System.out.println("Longitude: " + lng);
  }
}
