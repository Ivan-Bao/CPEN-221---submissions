import static java.lang.Boolean.TRUE;

/**
 * This class provides functions to search in arrays.
 * 
 */

public class ArrayThreeSum {

    /**
     * Checks if the sum of three numbers in an array is 0. An array element can be
     * picked more than once.
     * 
     * @param input the array to search in
     * @return true if the sum of three numbers chosen from input can be 0, and
     *         false otherwise.
     */
    public static boolean check3Sum(int[] input) {

        // TODO: Implement this method!
        // It is set to return false by default, but that is not the correct answer!

        // To get you started, here is code that prints the elements of the array
        // and computes the sum of elements in the array
        // Note the abbreviated for loop syntax
        // x takes each value in the array input, in order
        // You should remove these loops later!
        System.out.println("Checking all the combinations with overlapping allowed...");
        int sum = 1;
        int x_index = 0;


        for(int x : input) {

            int y_index = 0;

            for (int y : input) {

                int z_index = 0;

                for (int z : input) {
                    if (x_index==y_index || y_index==z_index || x_index==z_index){
                    System.out.println("overlapped");
                } else {
                        System.out.print("num 1 =" + x + "\n");
                        System.out.print("num 2 =" + y + "\n");
                        System.out.print("num 3 =" + z + "\n");
                        sum = x + y + z;
                        System.out.println("sum = " + sum + "\n");
                        if (sum == 0) {
                        return TRUE;
                        }

                    }
                    z_index++;
                }

                    y_index++;
            }
            x_index++;
        }


        return false;

    }

    /** 
     * Checks if the sum of three numbers in an array is 0.
     * An array element can be picked at most once.
     * 
     * @param input the array to search in rue if th
     *          sum of three numbers in input can be 0, 
     *          and false otherwise.
     */
    public static boolean check3Sum_noDups(int[] input) {
        
        // TODO: Implement this method!
        // It is set to return false by default, but that is not the correct answer!
        return false;

    }

}