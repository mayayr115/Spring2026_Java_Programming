package Lab.Lab05;

// Maya Ramkishun
// 3/9/26
// This program extends the Content class and implements both the Readable.read() method and the Watchable.watch() method

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
    return transcript ? 5 : duration;
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
