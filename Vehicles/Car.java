package Vehicles;
import java.text.DecimalFormat;
import java.util.Random;

/*
 * This class represents a Car object. Each Car has
 * a price, a mileage, and an indicator of whether it is
 * currently for sale.
 *
 * A Car cannot have a negative price or mileage.
 * The constructors and setter methods ensure this via exceptions.
 *
 * By default, a Car object is for sale when created.
 */
public class Car {

    private boolean forSale;
    private double price;
    private double mileage;

    /*
     * Constructs a Car with a random price between
     * $5,000.00 and $100,000.00, and random mileage between
     * 0 and 150,000 miles.
     */
    public Car() {
        forSale = true;
        Random r = new Random();
        price = (r.nextInt(9500000) + 500000) / 100.0;
        mileage = r.nextInt(150001);
    } // Car

    /*
     * Constructs a Car object with the given price and mileage.
     * Neither value can be negative.
     *
     * input parameters are price & mileage of the car
     * the method may throw an exception
     */
    public Car(double price, double mileage) {
        if (price < 0 || mileage < 0) {
            throw new IllegalArgumentException("Price and mileage must be non-negative.");
        }
        this.price = price;
        this.mileage = mileage;
        this.forSale = true;
    } // Car

    /*
     * Returns a string representation of this Car in the format:
     * Car(Price: $35,000.00, Mileage: 42,000 miles)
     */
    @Override
    public String toString() {
        DecimalFormat decimalFormatObj = (DecimalFormat) DecimalFormat.getInstance();
        decimalFormatObj.setMinimumFractionDigits(2);
        decimalFormatObj.setMaximumFractionDigits(2);
        return "Car(Price: $" + decimalFormatObj.format(price) +
                ", Mileage: " + decimalFormatObj.format(mileage) + " miles)";
    } // toString

    /* Sets a new price for the car. */
    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        this.price = price;
    } // setPrice

    /* Sets a new mileage for the car. */
    public void setMileage(double mileage) {
        if (mileage < 0) {
            throw new IllegalArgumentException("Mileage cannot be negative.");
        }
        this.mileage = mileage;
    } // setMileage

    /* Sets whether or not the car is for sale. */
    public void setForSale(boolean forSale) {
        this.forSale = forSale;
    } // setForSale

    /* Returns true if this car is for sale. */
    public boolean isForSale() {
        return forSale;
    } // isForSale

    /* Returns the price of this car. */
    public double getPrice() {
        return price;
    } // getPrice

    /* Returns the mileage of this car. */
    public double getMileage() {
        return mileage;
    } // getMileage
} // Car
