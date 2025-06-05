import java.util.*;
public class A_In_Search_of_an_Easy_Problem {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        int sum =0;
        for( int i = 0 ;i<n;i++){
             arr[i] = scn.nextInt();
            sum += arr[i];
        }
        if (sum>0) {
            System.out.println("HARD");
        }else{
            System.out.println("EASY");
        }
    }
}