import java.util.Scanner;
import java.text.DecimalFormat;
// I learned how to round ^, from this website https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java.

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("##.00");


        System.out.println("Welcome to the  tip Calculator!");
        System.out.print("How many people are in your group: ");
        int people = scan.nextInt();

        System.out.print("What's the tip percentage? (0-100): ");
        int tip = scan.nextInt();

        // The 3 variables are initialized outside the 'while' loop so that they can be used in the display screen
        double amount = 0;
        double input = 0;
        String item = "";
        while (input != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            input = scan.nextDouble();
            scan.nextLine();
            amount += input;

            // The if statement stops the code from running after the -1 has been inputted
            if (input != -1) {
                System.out.print("Enter the person who ordered: ");
                item += scan.nextLine();
                item += " ordered ";

                System.out.print("Enter the item they ordered: ");
                item += scan.nextLine();
                item += "\n";
            }
        }
        // The line below makes it the so that the overall value is not subtracted by 1
        amount ++;

        // Display screen
        System.out.println("-------------------------------");
        System.out.println("Total bill before tip: $" + f.format(amount));
        System.out.println("Total percentage: " + tip + "%");
        System.out.println("Total tip: $" + f.format(amount * tip/100));
        System.out.println("Total bill with tip: $" + f.format(amount + (amount * tip/100)));
        System.out.println("Per person cost before tip: $" + f.format(amount/people));
        System.out.println("Tip per person: $" + f.format((amount * tip/100)/people));
        System.out.println("Total cost per person: $" + f.format((amount + (amount * tip/100))/people));
        System.out.println("-------------------------------");
        System.out.println("Items ordered:");
        System.out.println(item);


    }
}