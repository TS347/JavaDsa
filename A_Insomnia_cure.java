import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class A_Insomnia_cure {

    
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int k = scn.nextInt();
        int l = scn.nextInt();
        int m = scn.nextInt();
        int n = scn.nextInt();
        int d = scn.nextInt();
        int count = 0;
        if (k ==1) {
            System.out.println(d);
        }else{
            for( int i =1;i<=d ; i++){
                if (i%l ==0) {
                    count ++;
                }else if( i%m ==0 ){
                    count++;
                }else if (i%n ==0) {
                    count++;
                }else if (i%k==0) {
                    count++;
                }else{
                    continue;
                }
            }

            System.out.println(count);
        }
    }
}