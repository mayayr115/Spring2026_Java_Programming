package Lab.Lab05;

// Maya Ramkishun
// 3/9/26
// This program is the parent class for Article, Video, and Podcast

public abstract class Content {
  public String title;
  public String author;

  public Content(String title, String author) {
    this.title = title;
    this.author = author;
  }

  public abstract void displayInfo();
  public abstract double calculateReadingTime();

  public void publish() {
    System.out.printf("Publishing content: %s%n", this.title);
  }
}
