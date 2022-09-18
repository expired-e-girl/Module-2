import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        //Scanner object for inputs
        Scanner input = new Scanner(System.in);

        //Prompt user for the radius value
        System.out.println("Enter the radius of a circle: ");
        double r = input.nextDouble();


        //To calculate the area of a circle: 𝐴=𝜋⋅𝑟^2
        double area = (Math.PI) * Math.pow(r, 2);
        System.out.println("The area of the circle is: " + area);

    }
}
