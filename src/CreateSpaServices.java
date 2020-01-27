import java.util.Scanner;

public class CreateSpaServices {

    public static void main(String [] args)
    {
        String service;
        double price;
        String getString = null;

        SpaService firstService = new SpaService();
        SpaService secondService = new SpaService();
        Scanner input = new Scanner(System.in);


        pl("Enter service >> ");
        service = input.nextLine();
        pl("Enter price >> ");
        price = input.nextDouble();

        firstService.setServiceDescription(service);
        firstService.setPrice(price);

        input.nextLine();
        pl("Enter service >> ");
        service = input.nextLine();
        System.out.println("Enter price >> ");
        price = input.nextDouble();
        secondService.setServiceDescription(service);
        secondService.setPrice(price);

        pl("First service details:");
        pl(firstService.getServiceDescription() + " $" + firstService.getPrice());
        pl("Second service details:");
        pl(secondService.getServiceDescription() + " $" + secondService.getPrice());

    }
    public static void pl(String getString)
    {
        System.out.println(getString);
    }
}
