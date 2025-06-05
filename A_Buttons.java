import java.util.*;
public class A_Buttons {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int t = scn.nextInt();
        for( int j =0;j<t;j++){
            int n = 3;
            int arr[] = new int[n];
            for( int i = 0 ;i<n;i++){
                 arr[i] = scn.nextInt();
            }
            // int as = arr[n-3] + (arr[n-1]/2);
            // int ks = arr[n-2] + (arr[n-1]/2);
            // if (arr[n-1]%2==0) {
            //     if (arr[n-2] == arr[n-3]) {
            //         System.out.println("Second");
            //     }else if (as>ks) {
            //         System.out.println("First");
            //     }else{
            //         System.out.println("Second");
            //     }
            // }else{
            //     // jo equal hoga is aur common button odd goga then annie jitegi kyuki common button par last turrn uska tha 
            //     if (as>=ks) {
            //         System.out.println("First");
            //     }else{
            //         System.out.println("Second");
            //     }
            // }

           int as = arr[n-3] + (arr[n-1]/2);
           int ks = arr[n-2] + (arr[n-1]/2);
           int c = arr[n-1]%2;
           if (c==1) {
            as++;
            
           }

           if (as>ks) {
            System.out.println("First");
            
           }else{
            System.out.println("Second");
           }
        }
    }
}