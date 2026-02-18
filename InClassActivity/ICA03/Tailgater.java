package InClassActivity.ICA03;

public class Tailgater {
  private static int drinksInCooler;
  private static int numberOfTailgaters;
  private String name;
  private boolean isBingFan;
  public int drinks;

  public String getName() {
    return this.name;
  }

  public int getNumberOfTailgaters() {
    return Tailgater.numberOfTailgaters;
  }

  public boolean isBingFan() {
    return this.isBingFan;
  }

  public void getDrinkFromCooler() {
    
  }

  public boolean isCoolerEmpty() {
    return Tailgater.drinksInCooler <= 0;
  }

  public int getDrinksInCooler() {
    return Tailgater.drinksInCooler;
  }

  public void addDrinksToCooler(int drinks) {
    this.drinks += drinks;
    System.out.printf("Total drinks in the cooler: %d", drinks);
  }
}
