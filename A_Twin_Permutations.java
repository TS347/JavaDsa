import java.util.*;
public class A_Twin_Permutations {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int t = scn.nextInt();
        for( int j =0 ;j<t;j++){
            int n = scn.nextInt();
            int arr[] = new int[n];
            for( int i = 0 ;i<n;i++){
                 arr[i] = scn.nextInt();
            }
            int dt = n+1;
            // ArrayList<Integer>list = new ArrayList<>();
            for( int i =0 ;i<n;i++){
                int diff = dt -arr[i];
                System.out.print(diff +" ");
            }
            System.out.println();
        }
    }
}