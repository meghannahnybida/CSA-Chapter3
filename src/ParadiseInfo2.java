import java.util.Scanner;

public class ParadiseInfo2 {
    //Author: Meghan Nahnybida
    //Date: 1/23/2020

    public static void main(String [] args)
    {
        double price;
        double discount;
        double savings;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter cutoff price for discount >> ");
        price = input.nextDouble();

        System.out.println("Enter discount rate as a whole number >> ");
        discount = input.nextDouble();


        displayInfo();
        savings = computeDiscountInfo(price, discount);
        System.out.println("Special this week on any service over " + price);
        System.out.println("Discount of " + discount + " percent.");
        System.out.println("That's a savings of at least $" + savings);
        System.out.println("");
    }

    public static void displayInfo()
    {
        System.out.println("Paradise Day Spa wants to pamper you.");
        System.out.println("We will make you look good.");
    }

    public static double computeDiscountInfo(double pr, double dscnt)
    {
        double savings;
        savings = pr * dscnt / 100;
        return savings;
    }

}
