import java.util.*;
public class B_Drinks {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        float sum =0;
        int arr[] = new int[n];
        for( int i = 0 ;i<n;i++){
             arr[i] = scn.nextInt();
             sum += arr[i];
        }
        double fraction = sum/n;
        System.out.printf("%.12f", fraction);

    }
}