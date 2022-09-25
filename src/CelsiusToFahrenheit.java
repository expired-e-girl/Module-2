import java.util.Scanner;

//Let's convert dis shit
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        //Create a scanner
        Scanner input = new Scanner(System.in);

        //Prompt user for a value
        System.out.println("Enter a degree in celsius: ");
        double celsius = input.nextDouble();
        //Calculate fahrenheits and print the result
        double fahrenheit = 9.0 / 5.0 * celsius + 32;

        System.out.println(celsius + " degree celsius is " + fahrenheit + " in fahrenheit.");

    }
}
