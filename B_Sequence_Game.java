import java.util.*;

public class B_Sequence_Game {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int t = scn.nextInt();
       
        for( int j =0 ;j<t;j++){
             int n = scn.nextInt();
             int b[] = new int[n];
            ArrayList<Integer>a = new ArrayList<>();
           for( int i = 0 ;i<n;i++){
                 b[i] = scn.nextInt();
            }
            a.add(b[0]);
            for( int k =1;k<n;k++){
                
                if (b[k] >=b[k-1]) {
                    a.add(b[k]);
                }else{
                    a.add(b[k]);
                    a.add(b[k]);
                }
            }

            System.out.println(a.size());
            for( int m=0;m<a.size();m++){
                System.out.print(a.get(m)+" ");
            }
            System.out.println();
            a.clear();

    }
    
    }
}