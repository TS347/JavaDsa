import java.util.*;
public class A_Arrival_of_the_General {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for( int i = 0 ;i<n;i++){
             arr[i] = scn.nextInt();

        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxi = 0;
        int mini =0;
        for( int i =0;i<n;i++){
            if (arr[i] >max) {//Equal sign is not used so as the first maximum index is recorded
                max = arr[i];
                maxi = i;
            }
        }

        for( int i =0;i<n ;i++){
            if (arr[i]<=min) {//Equal sign is used so that the last occuring minimum is recorded 
                min = arr[i];
                mini = i;
            }
        }
        mini++;
        maxi++;
        if (maxi<mini) {
            System.out.println(((maxi-1)+ (n-mini)));
        }else  {
            System.out.println(((maxi-1)+(n-mini-1)));
        }
    }
    
}