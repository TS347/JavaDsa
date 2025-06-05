import java.util.*;
public class A_Forbidden_Integer {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int t = scn.nextInt();
        for( int j =0;j<t;j++){
            int n = scn.nextInt() , k = scn.nextInt() , x = scn.nextInt();
            int sum = 0;
            
            ArrayList<Integer>list = new ArrayList<>();
           if (x!=1) {
            System.out.println("YES");
            System.out.println(n);
            for( int m =1;m<=n;m++){
                System.out.print(1+" ");
            }
            System.out.println();
           }else if (x==1) {
            if (k==1 || ( k==2 && n%2 !=0)) {
                System.out.println("NO");
            }else{
                System.out.println("YES");
                if (n%2==0) {
                    System.out.println(n/2);
                    for( int i =1;i<=n/2 ;i++){
                        System.out.print(2+" ");
                    }
                    System.out.println();
                }else{
                    // Any odd number gretar of equal to 3 can be formed using 3 and 2 
                    System.out.println((n-3)/2 +1 );
                    for( int i =1;i<=(n-3)/2 ;i++){
                        System.out.print(2+ " ");
                    }
                    System.out.println(3);
                }
            }
           }
            
        }
    }
}
