package InClassActivity.ICA04;

public class SmartThermostat extends SmartDevice {
  private int temperature;

  public SmartThermostat(String name, int temperature) {
    super(name);
    this.temperature = temperature;
  }

  @Override
  public void turnOn() {
    super.setStatus(true);
    super.displayStatus();
    System.out.printf("Temperature set to %dºF.%n", this.temperature);
  }

  @Override
  public void turnOff() {
    super.setStatus(false);
    super.displayStatus();
  }

  @Override
  public void adjustSettings(int temperature) {
    if (temperature >= 60 && temperature <= 80) {
      this.temperature = temperature;
      System.out.printf("%s adjusted to %dºF.%n", this.getName(), temperature);
    }
    else System.out.println("Invalid temperature. Please provide a value between 60ºF and 80ºF.");
  }
}
