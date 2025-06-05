import java.util.*;
public class A_Ambitious_Kid {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int arr[] = new int [n];
        for( int i =0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        //Finding minimum non-negative number
        int min = Integer.MAX_VALUE;
        for( int i = 0 ;i<n;i++){
            if (Math.abs(arr[i]) <min ) {
                min = Math.abs(arr[i]);
                
            }
        }
       System.out.println(min);
    }
}