import java.util.*;
public class A_Desorting {
    public static boolean isSorted( int arr[]){
        
        if (arr==null|| arr.length<=1) {
            return true ;
        }
        for( int i =1;i<arr.length ;i++){
            if (arr[i]<arr[i-1]) {
                return false ;
            }
        }
        return true ;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int t = scn.nextInt();
        for( int j =0;j<t ;j++){
            int n = scn.nextInt();
            int arr[] = new int[n];
            for( int i = 0 ;i<n;i++){
                 arr[i] = scn.nextInt();
            }
            if (!isSorted(arr)) {
                System.out.println(0);
                
            }else{
                int diff =0;
                int mindiff =Integer.MAX_VALUE;
                for( int i =1;i<n;i++){
                    diff = arr[i]-arr[i-1];
                    mindiff = Math.min(mindiff, diff);
                }
                // int count =0;
                // while (mindiff>=0) {
                //     mindiff = mindiff -2 ;
                //     count++;
                // }    
                // System.out.println(count);
                System.out.println(mindiff /2  + 1);
            }
        }
    }
}