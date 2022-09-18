import java.util.Scanner;

public class RandomNumber {

    public static void main(String[] args) {
        //Scanner object for inputs
        Scanner input = new Scanner(System.in);

        //Getting random double value between 0 and 10.
        double random = Math.random() * 10;
        System.out.println("Your random double between 0 and 10 is: " + random);

        //Displays as an integer.
        int x = (int)random;
        System.out.println("As an integer it is: " + x);

        //First argument is used as the maximum for the randomly generated integer.
        int max = Integer.parseInt(args[0]);
        double maxRandom = Math.random() * max;
        int maxRandomNumber = (int) maxRandom;
        System.out.println("With a maximum of " + max + " the random number is " + maxRandomNumber);

        //Prompts user for a minimum
        System.out.print("Enter a minimum: ");
        int usermin = input.nextInt();

        //Prompts user for a maximum
        System.out.print("Enter a maximum: ");
        int usermax = input.nextInt();

        //Prints the result of the random number between the user's inputted maximum and minimum values
        double rangeRandom = (Math.random() * ((usermax - usermin) + 1)) + usermin;
        System.out.print("Your random value between " + usermin + " and " + usermax + " is: " + (int)rangeRandom );

    }


}
