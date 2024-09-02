package labordaydrill;
import java.util.Scanner;

public class LaborDayDrill {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your product?");
        String product = scanner.nextLine();

        System.out.println("How many items will you be buying?");
        int qty = scanner.nextInt();

        System.out.println("How much will you be spending?");
        double price = scanner.nextDouble();

        System.out.println("How many miles do you need to drive?");
        double miles = scanner.nextDouble();


        int milesFee = 0;
        if(miles >= 0 && miles < 5){
            milesFee = 2;
        }else if(miles > 6 && miles < 15){
            milesFee = 5;
        }else if(miles > 16 && miles < 25){
            milesFee = 10;
        }else if(miles > 26 && miles < 50){
            milesFee = 15;
        }else if(miles > 50){
            milesFee = 20;
        }else{
            System.out.println("Sorry, you are outside the service area.");
        }


        double total = ((qty * price) + milesFee);


        //System.out.println("Product:" + product + "." + "Qty:" + qty + "." + "Price:" + price + "." + "Miles:" + "." + miles + "Total:" + total);
        System.out.println("Product: " + product);
        System.out.println("Qty: " + qty);
        System.out.println("Price: " + price);
        System.out.println("Miles: " + miles);
        System.out.println("Your total will be: " + total);
    }
}
