import java.util.Scanner;

public class MetricConversion {

    public static void main(String [] args)
    {
        double userEntry;
        double convertGtoL;
        double convertItoC;
        GetSetMetricConverts gallonsNum1 = new GetSetMetricConverts();
        GetSetMetricConverts litersNum1 = new GetSetMetricConverts();

        GetSetMetricConverts inchesNum1 = new GetSetMetricConverts();
        GetSetMetricConverts centimetersNum1 = new GetSetMetricConverts();


        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number to convert it from inches to centimeters and gallons to liters.");
        userEntry = input.nextDouble();

        convertGtoL = conversionGallon(userEntry);
        convertItoC = conversionInches(userEntry);
        gallonsNum1.setGallons(userEntry);
        litersNum1.setLiters(convertGtoL);
        inchesNum1.setInches(userEntry);
        centimetersNum1.setCentimeters(convertItoC);

        System.out.println(gallonsNum1.getGallons() + " gallons is " + litersNum1.getLiters() + " liters.");
        System.out.println(inchesNum1.getInches() + " inches is " + centimetersNum1.getCentimeters() + " centimeters.");

    }

    public static double conversionGallon(double entry)
    {
        double convertGtoL;
        convertGtoL = entry * 3.785411784;

        return convertGtoL;

    }

    public static double conversionInches(double entry)
    {
        double convertItoC;
        convertItoC = entry * 2.54;

        return convertItoC;

    }
}
