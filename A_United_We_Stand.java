import java.util.*;
public class A_United_We_Stand {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int t = scn.nextInt();
        for( int j =0 ;j<t;j++){
            ArrayList<Integer>b = new ArrayList<>();
            ArrayList<Integer>c = new ArrayList<>();
            // b%c !=0
            int n = scn.nextInt();
            int arr[] = new int[n];
            for( int i = 0 ;i<n;i++){
                 arr[i] = scn.nextInt();
            }
            Arrays.sort(arr);
            int x= arr[0];
            b.add(arr[0]);
            for( int k =1;k<n;k++){
                if (x%arr[k] ==0) {
                    b.add(arr[k]);
                }else{
                    c.add(arr[k]);
                }
            }

            int bs = b.size();
            int cs = c.size();
            if (cs==0) {
                System.out.println(-1);
                
            }else{
                System.out.print(bs+" "+cs);
                System.out.println();
                for( int i = 0;i<bs ; i++){
                    System.out.print(b.get(i)+" ");

                }
                System.out.println();
                for( int i = 0;i<cs ; i++){
                    System.out.print(c.get(i)+" ");

                }
                System.out.println();


            }
            
            b.clear();
            c.clear();
        }
    }
}