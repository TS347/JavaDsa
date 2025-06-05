import java.util.*;
public class A_Coins {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int t = scn.nextInt();
        for( int j =0;j<t;j++){
            // int n = 2;
            // long arr[] = new long[n];
            // for( int i = 0 ;i<n;i++){
            //      arr[i] = scn.nextInt();
            // }
            // int k = arr[1];
             long n  = scn.nextLong();
            long k = scn.nextLong();
            if (n%2==0 || (n-k)%2==0) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}