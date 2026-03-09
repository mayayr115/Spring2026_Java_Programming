package Lab.Lab05;

public class Driver {
  public static void main(String[] args) {
    //Test#01
    Article article = new Article("Learn Java The Right Way",
    "Dr. Lawrence Decamora", 1200);
    article.displayInfo();
    System.out.println("Estimated Reading Time: " + article.calculateReadingTime() + " minutes");
    article.read();
    article.publish();
    System.out.println();

    //Test#02
    Podcast podcast = new Podcast("Java Basics",
    "John Doe", 20.0, false);
    podcast.displayInfo();
    System.out.println("Estimated Reading Time: "
    + podcast.calculateReadingTime() + " minutes");
    podcast.read();
    podcast.watch();
    System.out.println();

    //Test#03
    Video video = new Video("Java Tutorial",
    "Michelle Decamora", 30.0);
    video.displayInfo();
    System.out.println("Estimated Watching Time: " + video.calculateReadingTime() + " minutes");
    video.watch();
    video.publish();
    System.out.println();

    //Test#04
    Article article2 = new Article("OOP Principles",
    "Alice Smith", 450);
    article2.displayInfo();
    System.out.println("Estimated Reading Time: "
    + article2.calculateReadingTime() + " minutes");
    article2.read();
    System.out.println();

    //Test#05
    Podcast podcast2 = new Podcast("Advanced Java", "Michael Brown", 40.0, true);
    podcast2.displayInfo();
    System.out.println("Estimated Reading Time: "
    + podcast2.calculateReadingTime() + " minutes");
    podcast2.read();
    podcast2.watch();
    System.out.println();

    //Test#06
    Article miniArticle = new Article("Java Keywords", "Chris Lee", 50);
    miniArticle.displayInfo();
    System.out.println("Estimated Reading Time: " + miniArticle.calculateReadingTime() + " minutes");
    miniArticle.read();
    System.out.println();

    // Test #07
    Content content1 = new Article(
    "Data Structures",
    "Dr. Smith",
    800);
    content1.displayInfo();
    System.out.println("Estimated Reading Time: " + content1.calculateReadingTime() + " minutes");
    content1.publish();
    System.out.println();

    // Test #08
    Readable readableContent = new Article(
    "Encapsulation",
    "James Lee",
    600);
    readableContent.read();
    System.out.println();

    // Test #09
    Watchable watchableContent = new Video(
    "Lambda Expressions",
    "Sarah Brown",
    12.5);
    watchableContent.watch();
    System.out.println();

    // Test #10
    Content[] contents = {
    new Article("Inheritance", "Alice Blue", 1000),
    new Video("Interfaces Explained", "Mark Black", 18.0),
    new Podcast("Exception Handling", "Nina Gray", 22.0,
    true)
    };
    for (Content c : contents) {
      c.displayInfo();
      System.out.println("Estimated Time: " + c.calculateReadingTime() + " minutes");
      c.publish();
      System.out.println();
    }
  }
}
