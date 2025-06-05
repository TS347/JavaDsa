import java.util.*;
public class B_Blank_Space {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int t = scn.nextInt();
        for( int m=0;m<t;m++ ){
            
        int count = 0 ;int maxcount = 0;
        int n = scn.nextInt();
        int arr[] = new int[n];
        for( int i = 0 ;i<n;i++){
             arr[i] = scn.nextInt();
             
        }
        for( int j =0;j<n;j++){
            if (arr[j] ==0) {
                count++;
                maxcount = Math.max(count,maxcount);
            }else{
                count=0;
            }
        }
        System.out.println(maxcount);
        
        
    }
}
}