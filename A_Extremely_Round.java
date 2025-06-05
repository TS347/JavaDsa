import java.util.*;
public class A_Extremely_Round {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int t = scn.nextInt();
        for( int i =0;i<t ; i++){
            int temp =0;
            int n = scn.nextInt();
             int nc = 0;
             
            for( int k =1;k<=9;k++){
                    for( int m =k;m<=n;m*=10){
                        nc++;
                    }
    }
    System.out.println(nc);
    }
}
}