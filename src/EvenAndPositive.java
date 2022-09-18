public class EvenAndPositive {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        boolean even = false;
        boolean positive = false;
        boolean posEven = false;
        if (num % 2 == 0) {
            even = true;
        }
        if (num >= 0) {
            positive = true;
        }
        if (even && positive) {
            posEven = true;
        }
        System.out.println(num + " is an even number: " + even);
        System.out.println(num + " is a positive number: " + positive);
        System.out.println(num + " is a positive even number: " + posEven);
    }
}
