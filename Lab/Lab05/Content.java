package Lab.Lab05;

public abstract class Content {
  private String title;
  private String author;

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
