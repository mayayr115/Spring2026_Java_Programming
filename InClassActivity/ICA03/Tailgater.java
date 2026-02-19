package InClassActivity.ICA03;

public class Tailgater {
  private static int drinksInCooler;
  private static int numberOfTailgaters;
  private final String name;
  private final boolean isBingFan;
  public int drinks;

  public Tailgater(String name, boolean isBingFan) {
    this.name = name;
    this.isBingFan = isBingFan;
    numberOfTailgaters += 1;

    if (!isBingFan()) {
      for (int i = 0; i < 5; i++) {
        System.out.println("Go Binghamton!!!!!");
      }
    }
  }

  public String getName() {
    return this.name;
  }

  public static int getNumberOfTailgaters() {
    return Tailgater.numberOfTailgaters;
  }

  private boolean isBingFan() {
    return this.isBingFan;
  }

  public void getDrinkFromCooler() {
    if (!Tailgater.isCoolerEmpty()) {
      this.drinks += 1;
      Tailgater.drinksInCooler -= 1;
      System.out.printf("%s grabbed a drink. Drinks taken: %d%n", this.name, this.drinks);
      System.out.printf("There are %d more drinks in the cooler%n", Tailgater.drinksInCooler);
    }
    else System.out.printf("I'm sorry, %s. There are no drinks left%n", this.name);
  }

  public static boolean isCoolerEmpty() {
    return Tailgater.drinksInCooler <= 0;
  }

  public static int getDrinksInCooler() {
    return Tailgater.drinksInCooler;
  }

  public static void addDrinksToCooler(int drinks) {
    Tailgater.drinksInCooler += drinks;
    System.out.printf("Added %d drinks to the cooler.%n", drinks);
    System.out.printf("Total drinks in the cooler: %d%n", Tailgater.drinksInCooler);
  }
}
