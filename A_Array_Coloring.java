import java.util.*;
public class A_Array_Coloring {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner (System.in);
        /*Even +- even == Even 
         * Oddd +- odd = Even
         * Even +- odd = odd
         * odd +- even = odd
         */
        
        int t = scn.nextInt();
        for( int j =0;j<t ;j++){
            int n = scn.nextInt();
            int arr[] = new int[n];
            for( int i = 0 ;i<n;i++){
                 arr[i] = scn.nextInt();
            }

            int count =0;
           for(int k =0;k<n ;k++ ){
            if (arr[k] %2 !=0) {
                count++;
            }
           }
           if (count%2 ==0) {
            System.out.println("YES");
           }else{
            System.out.println("NO");
           }

        }
    }
}