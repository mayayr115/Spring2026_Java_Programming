package InClassActivity.ICA04;

public abstract class SmartDevice {
  private final String name;
  private boolean status;

  public SmartDevice(String name) {
    this.name = name;
    this.status = false;
  }

  public abstract void turnOn();
  public abstract void turnOff();
  public abstract void adjustSettings(int value);

  public void displayStatus() {
    if (!this.status) System.out.printf("%s is now OFF.%n", this.name);
    else System.out.printf("%s is now ON. ", this.name);
  }

  public String getName() {
    return this.name;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }
}
