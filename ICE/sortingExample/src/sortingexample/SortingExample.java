package sortingexample;

/**
 *
 * @author chris
 */
public class SortingExample {

    public static void main(String[] args) {
        int[] someNums = {90, 85, 65, 95, 75};
        int a = 1;
        while (a < someNums.length) {
            int temp = someNums[a];
            int b = a - 1;
            while (b >= 0 && someNums[b] > temp) 
            {
                someNums[b + 1] = someNums[b];
                --b;
            }
            someNums[b + 1] = temp;
            ++a;
        }
    }
}
