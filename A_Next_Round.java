import java.util.*;
public class A_Next_Round {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int arr[] = new int[n];
        int count  = 0;
        for( int i = 0 ;i<n;i++){
             arr[i] = scn.nextInt();
        }
        // Array is sorted in descending order so the 1st place has highest point snad similarly the 5th position the 5th highest points

        int point = arr[k-1];

        for( int j =0;j<n ;j++){
            if (arr[j] >=point && arr[j]>0 ) {//point>0 as positive score is required
                count++;
            }
        }
        
        System.out.println(count);

    }
}