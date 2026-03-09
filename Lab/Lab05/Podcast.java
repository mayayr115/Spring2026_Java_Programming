package Lab.Lab05;

public class Podcast extends Content implements Watchable, Readable {
  private final double duration;
  boolean transcript;

  public Podcast(String title, String author, double duration, boolean transcript) {
    super(title, author);
    this.duration = duration;
    this.transcript = transcript;
  }

  @Override
  public void displayInfo() {
    System.out.printf("Podcast: \"%s\", by %s%nDuration: %.1f minutes%nTranscript Available: %b%n", this.title, this.author, this.duration, this.transcript);
  }

  @Override
  public double calculateReadingTime() {
    return transcript ? 1000/200 : duration;
  }

  @Override
  public void watch() {
    System.out.printf("Watching Podcast: \"%s\"%n", this.title);
  }

  @Override
  public void read() {
    System.out.printf("Reading Podcast: \"%s\"%n", this.title);
  }
}
