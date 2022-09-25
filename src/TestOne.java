public class TestOne {
    public static void main(String[] args) {
        int x = 3;
        int y = 3;
        int z = 3;

        if (x <= z) {
            System.out.println(z);
            z = 4;
        }
        if (z > y) {
            x = 2;
            System.out.println(x);
        } else {
            System.out.println(z < x);
        }

    }
}
