import java.util.*;
public class A_Team {

    public static void main(String[] args) {
        
        
        Scanner scn = new Scanner (System.in);
        
        int n = scn.nextInt();
        int tc = 0;
        for( int j =0;j<n ;j++){
        int arr[] = new int[3];
        int oc =0;
        for( int i = 0 ;i<3;i++){

             arr[i] = scn.nextInt();
             if (arr[i] ==1) {
                oc++;
             }
        }
        if (oc>=2) {
            tc++;
        }


    }
    System.out.println(tc);
    }
}