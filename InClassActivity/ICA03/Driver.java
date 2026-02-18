package InClassActivity.ICA03;

public class Driver {

    public static void main(String[] args) {

        // Display cooler status before adding any drinks
        System.out.println("Is cooler empty?  "+Tailgater.isCoolerEmpty());

        // Add drinks before tailgaters arrive
        Tailgater.addDrinksToCooler(10);

        // Create tailgaters
        Tailgater t1 = new Tailgater("Alex", true);
        Tailgater t2 = new Tailgater("Jordan", false);
        Tailgater t3 = new Tailgater("Sam", true);

        // Tailgaters grab drinks
        t1.getDrinkFromCooler();
        t1.getDrinkFromCooler();

        t2.getDrinkFromCooler();

        t3.getDrinkFromCooler();
        t3.getDrinkFromCooler();
        t3.getDrinkFromCooler();

        // Display cooler status
        System.out.println("Is cooler empty? " + Tailgater.isCoolerEmpty());
        System.out.println("Drinks left in cooler: " + Tailgater.getDrinksInCooler());

        // Add more drinks
        Tailgater.addDrinksToCooler(5);

        // Display total tailgaters
        System.out.println("Total tailgaters created: " + Tailgater.getNumberOfTailgaters());
    }
}