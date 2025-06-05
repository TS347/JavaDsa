import java.util.*;
public class P_Log_2 {
    public static long log2n( long n ){
        if (n==1|| n==0 ) {
            return 0;
        }
        
        return 1+ log2n(n/2);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        long n = scn.nextLong();
        System.out.println(log2n(n));
    }
}