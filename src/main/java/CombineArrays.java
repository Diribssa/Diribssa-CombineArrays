import java.util.Arrays;

public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
       int a1 = arr1.length;
       int a2 = arr2.length;

       int b1 = a1 + a2;

       int[] b = new int[b1];
        for (int i = 0; i < a1; i = i + 1) {
         b[i] = arr1[i]; // this for loop is for the first array to equal the new int b
        }
             for ( int i = 0; i < a2; i = i + 1){
             b[a1 + i] = arr2[i]; // this for loop is for the second array to equal the value of new int b plus first array
             }
                for ( int i = 0; i < b1; i = i + 1){
                  System.out.print(b[i]); // to loop the statement int[] b
                }
    return b;
    }
}
