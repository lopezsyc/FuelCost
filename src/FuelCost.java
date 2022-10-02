import java.util.Scanner;

public class FuelCost {

    public static void main(String[] args) {

        double fuelEffi;
        double price;
        double miles;
        double hundredMiles;
        double gallon;
        double pricePerGallon;
        String trash;

        Scanner in = new Scanner(System.in);

        System.out.println("Input number of gallons in car: ");

        if (in.hasNextDouble()) {
            gallon = in.nextDouble();
            in.nextLine();

            System.out.println("Input fuel efficiency (miles per gallon): ");

            if (in.hasNextDouble()) {
                fuelEffi = in.nextDouble();
                in.nextLine();

                System.out.println("Input price per gallon: ");

                if (in.hasNextDouble()) {
                    pricePerGallon = in.nextDouble();
                    in.nextLine();

                    hundredMiles = 100 / fuelEffi;
                    miles = fuelEffi * gallon;

                    System.out.println("The cost per 100 miles is: " + hundredMiles);
                    System.out.println("The car will go " + miles + "miles");

                } else {
                    trash = in.nextLine();
                    System.out.println("You entered an invalid value: " + trash);
                }
            }
        }
    }
}