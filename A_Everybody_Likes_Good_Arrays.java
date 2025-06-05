import java.util.*;
public class A_Everybody_Likes_Good_Arrays {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int t = scn.nextInt();
        for( int j = 0 ;j<t ; j++){
            int n = scn.nextInt();
            int arr[] = new int[n];
            for( int i = 0 ;i<n;i++){
                 arr[i] = scn.nextInt();
            }
            int op =0;
            for( int i =1;i<n;i++){
                // int a= arr[i-1]&1;
                // int b = arr[i]&1 ;
                // & anaylses both sides 

                if ((arr[i-1]&1) ==0 & (arr[i]&1)==0 ) {
                    op++;
                }
                if ((arr[i-1]&1 )!=0 & (arr[i]&1 )!=0 ) {
                    op++;
                }
            }
            System.out.println(op);
        }
    }
}