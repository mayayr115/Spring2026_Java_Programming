package InClassActivity.ICA04;

public class SmartSpeaker extends SmartDevice {
  private int volume;
  
  public SmartSpeaker(String name, int volume) {
    super(name);
    this.volume = volume;
  }

  @Override
  public void turnOn() {
    super.setStatus(true);
    super.displayStatus();
    System.out.println("Playing music...");
    System.out.printf("%s volume set to %d%%.%n", this.getName(), this.volume);
  }

  @Override
  public void turnOff() {
    super.setStatus(false);
    super.displayStatus();
  }

  @Override
  public void adjustSettings(int volume) {
    if (volume >= 0 && volume <= 100) {
      this.volume = volume;
      System.out.printf("%s adjusted to %d%% volume.%n", this.getName(), volume);
      // System.out.printf("%s volume set to %d%%.%n", this.getName(), this.volume);
    }
    else System.out.println("Invalid volume. Please provide a value between 0% and 100%.");
  }
}
