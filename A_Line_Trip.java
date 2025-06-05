import java.util.*;

public class A_Line_Trip {
    // initially check boundary conditions
    

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int t = scn.nextInt();
        for( int j =0 ;j<t;j++){
        int n = scn.nextInt();
        int arr[] = new int[n];
        int x = scn.nextInt();
        for( int i = 0 ;i<n;i++){
             arr[i] = scn.nextInt();
        }
        int minr = 2*(x -arr[n-1]);
        int maxreq = 0 ;
        int initialr = arr[0];
        maxreq = Math.max(minr, initialr);
        for( int i = 1 ;i<n;i++){
             int diff = 0;
            diff =  arr[i] - arr[i-1];
            maxreq = Math.max(maxreq, diff);
        } 
        System.out.println(maxreq);
    }
    }
}