import java.util.*;
public class O_Fibonacci {
    public static long fibo( int n){
        if( n==1 || n==0){
            return n;
        }
       
        
        
        return fibo(n-1)+fibo(n-2);
        
    }

    public static void main(String[] args) {
       Scanner scn = new Scanner (System.in);
       int n = scn.nextInt();
       System.out.println(fibo(n-1));

    }
}