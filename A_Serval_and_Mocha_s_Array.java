import java.util.*;
import java.lang.Math;
public class A_Serval_and_Mocha_s_Array {
    public static int gcd(int a , int b ){
            while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
        

    public static void main(String[] args) {
        
        Scanner scn = new Scanner (System.in);
        int t = scn.nextInt();
        for( int j =0;j<t ; j++){
            int n = scn.nextInt();
            int arr[] = new int[n];
            for( int i = 0 ;i<n;i++){
                 arr[i] = scn.nextInt();
            }int flag =0 ;
            for( int i =0;i<n ;i++){
                for( int k =i+1;k<n ;k++){
                    
                    int c = gcd(arr[i], arr[k]);
                    if (c<=2) {
                        flag =1;
                        break;
                    }
                }
            }
            if (flag ==0) {
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
        }
    }
}