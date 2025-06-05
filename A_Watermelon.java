import java.util.*;
public class A_Watermelon {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int t = scn.nextInt();
        int flag =0;
       for( int i =2 ; i<=100 ; i+=2){
        // Option 1 that is brute force as only till 100 the testcase goes also O(n3) Tme complexity possible
        // for( int j =2 ; j<=100-i ;j+=2 ){
        //     if (i+j == t) {
        //         flag = 1;
        //     }
        // }

        /*
         * OPtimising the case as i is even if t is even then we will be get the required even
         * j only case  t==2 needs to be taken care of         
         */

        int j = t-i;
        if (t==2) {
            flag =0;
        }
        else if (j%2 ==0) {
            flag =1;
        }
       }
       if (flag ==0) {
        System.out.println("NO");
       }else{
        System.out.println("YES");
       }
    }
}