import java.util.*;
public class A_Grasshopper_on_a_Line {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int t = scn.nextInt();
        for( int j =0;j<t;j++){
            int n = 2;
            int arr[] = new int[n];
            for( int i = 0 ;i<n;i++){
                 arr[i] = scn.nextInt();
            }

            int x = arr[0];
            int k = arr[1];

            if (x%k ==0) {
                    System.out.println(2);
                    System.out.println(1 + " " +(x-1));
                    
                }
                else{
                    System.out.println(1);
                    System.out.println(x);
                    
                }
            
           
            }
        
    }
}