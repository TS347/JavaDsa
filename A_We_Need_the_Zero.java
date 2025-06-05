import java.util.*;
public class A_We_Need_the_Zero {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int t = scn.nextInt();
        for( int j =0;j<t;j++){
            int n = scn.nextInt();
            int arr[] = new int[n];
            int xor =0;
            for( int i = 0 ;i<n;i++){
                 arr[i] = scn.nextInt();
                xor = xor^arr[i];
            }
            if (n%2 ==0) {
                if (xor ==0) {
                    System.out.println(0);
                }else{
                    System.out.println(-1);
                }
            }else{
                System.out.println(xor);
            }
            // int flag =0;
            // for(int i =0;i<Math.pow(2, 8) ; i++ ){
            //     int arrn[] = new int[n];
            //     int b =0;
            //     for( int k =0;k<n;k++){
            //         arrn[k] = arr[k] ^ i;
            //         b= b^arrn[k];
            //     }
            //     if (b ==0) {
            //         flag =1 ;
            //         System.out.println(i);
            //         break;
            //     }
            // }
            // if (flag ==0) {
            //     System.out.println(-1);
            // }
        }
    }
}