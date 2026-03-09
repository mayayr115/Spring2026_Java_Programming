package Lab.Lab05;

// Maya Ramkishun
// 3/9/26
// This program extends the Content class and implements the Readable.read() method

public class Article extends Content implements Readable {
  private final int wordCount;

  public Article(String title, String author, int wordCount) {
    super(title, author);
    this.wordCount = wordCount;
  }

  @Override
  public void displayInfo() {
    System.out.printf("Article: \"%s\", by %s%nWord Count: %d%n", this.title, this.author, this.wordCount);
  }

  @Override
  public double calculateReadingTime() {
    return (float) wordCount/200;
  }

  @Override
  public void read() {
    System.out.printf("Reading Article: \"%s\"%n", this.title);
  }
}
