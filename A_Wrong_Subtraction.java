import java.util.*;
public class A_Wrong_Subtraction {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int count = 1;
        while (count<=k) {
            if (n%10==0) {
                n = n/10;
                count++;
            }else{
                n -= 1;
                count++;
            }
        }
        System.out.println(n);

    }    
}