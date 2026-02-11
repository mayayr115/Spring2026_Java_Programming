package DemoCode.Week3;
import java.util.Scanner;

public class ArrayOfTemperatures {

    public static void main(String[] args){

        System.out.println("How many temperatures do you have?");
        Scanner keyboard = new Scanner(System.in);
        int numOfTemperatures = keyboard.nextInt();
        double sum = 0;

        double[] temperatures = new double[numOfTemperatures];

        System.out.println("Enter " + numOfTemperatures + " temperatures:\t");

        for(int i = 0 ; i < numOfTemperatures ; i++){
            temperatures[i] = keyboard.nextDouble();
            sum = sum + temperatures[i];
        }

        System.out.println("The average temperature is:" + sum/numOfTemperatures);
        System.out.println("The temperatures are: ");

        for (int i = 0; i < numOfTemperatures; i ++){
            if(temperatures[i] == sum/numOfTemperatures){
                System.out.println(temperatures[i] + " average.");
            }else if(temperatures[i] < sum/numOfTemperatures){
                System.out.println(temperatures[i] + " below average");
            }else{
                System.out.println(temperatures[i] + " above average");
            }
        }
        System.out.println("Have a nice week.");

    }
}
