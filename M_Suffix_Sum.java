import java.util.*;

public class M_Suffix_Sum {

    // Recursive function to sum last M elements
    public static long sumLastM(int[] arr, int n, int m) {
        if (m == 0) {
            return 0;
        }
        return arr[n - m] + sumLastM(arr, n, m - 1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println(sumLastM(arr, n, m));
    }
}
