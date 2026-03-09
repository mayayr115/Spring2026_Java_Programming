package Lab.Lab05;

// Maya Ramkishun
// 3/9/26
// This program extends the Content class and implements the Watchable.watch() method

public class Video extends Content implements Watchable {
  private final double duration;

  public Video(String title, String author, double duration) {
    super(title, author);
    this.duration = duration;
  }

  @Override
  public void displayInfo() {
    System.out.printf("Video: \"%s\", by %s%nDuration: %.1f minutes%n", this.title, this.author, this.duration);
  }

  @Override
  public double calculateReadingTime() {
    return duration;
  }

  @Override
  public void watch() {
    System.out.printf("Watching Video: \"%s\"%n", this.title);
  }
}
