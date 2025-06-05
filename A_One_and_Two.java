import java.math.BigInteger;
import java.util.*;
public class A_One_and_Two {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int t = scn.nextInt();
        for( int j =0;j<t;j++){
            int n = scn.nextInt();
            int arr[] = new int[n];
            int ic = 0;
            int fc = 0;
            for( int i = 0 ;i<n;i++){
                 arr[i] = scn.nextInt();
                 if (arr[i] ==2) {
                    ic++;
                 }
            }
            if (ic ==0) {
                System.out.println(1);
            }
            if (ic%2 !=0) {
                System.out.println(-1);
            }else{
                for( int i =0;i<n ; i++){
                    if (arr[i] == 2) {
                        fc++;
                        if (fc == ic/2) {
                            System.out.println(i+1);
                        }
                    }
                }
            }
        }
    }
}

    