import java.util.Scanner;

public class SumOfThree {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter 3 numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        //Add the three numbers
        int sum = (number1 + number2 + number3);

        //Display result
        System.out.println("The sum of the three numbers is " + sum);
    }
}
