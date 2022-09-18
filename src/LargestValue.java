public class LargestValue {
    public static void main(String[] args){

        /*
       args used as examples are 22 666 80
       Convert strings to integers
       */
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);
        int largest;

        // Compare values to find largest one
        if ((i > j) && (i > k)) {
            largest = i;
        } else if ((j > i) && (j > k)){
            largest = j;
        } else {
            largest = k;
        }
        //Print largest value
        System.out.println(largest);
    }
}


