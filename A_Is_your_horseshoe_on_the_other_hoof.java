import java.util.*;
public class A_Is_your_horseshoe_on_the_other_hoof {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = 4;
        int arr[] = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        for( int i = 0 ;i<n;i++){
             arr[i] = scn.nextInt();
             if (!list.contains(arr[i])) {
                list.add(arr[i]);
             }
        }
        System.out.println(n-list.size());
    }
}