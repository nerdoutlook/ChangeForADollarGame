package Chapter3;
import java.util.Scanner;
/*
In the United States, these coins have following values:
Dollar = 100 cents
Quarter= 25 cents
Dime= 10 cents
Nickel= 5 cents
Penny= 1 cent
* The aim of this program is to add up various change in quarter, dime, nickel and penny to get a dollar
 */
public class ChangeForADollarGame {

    public static void main(String[] args) {

        // Initialize what we know
        int penny = 1; //cent
        int dime = 10; //cents
        int nickel = 5; //cents
        int quarter = 25; //cents
        int dollar = 100; //cents

        // Get What we don't know

        System.out.println("How many pennies would you like");
        Scanner scanner = new Scanner(System.in);
        int pennies =  scanner.nextInt();

        System.out.println("How many nickels would you like?");
        int nickels = scanner.nextInt();

        System.out.println("How many dimes would you like?");
        int dimes = scanner.nextInt();

        System.out.println("How many quarters would you like?");
        int quarters = scanner.nextInt();

        // Make a decision
        int total;

        total = (pennies*penny) + (dimes*dime) + (nickel*nickels) + (quarter*quarters);
        System.out.println("You have a total of " + total + " cents");
        System.out.println(" ");

        if (total == dollar){
            System.out.println("You win");
        }
        else if (total > dollar){
            System.out.println("You were over by " + (total - dollar) + " cents");
        }
        else {
            System.out.println("You were under by " + (dollar - total) + " cents");
        }


    }
}