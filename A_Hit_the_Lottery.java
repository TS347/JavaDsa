import java.util.*;

public class A_Hit_the_Lottery {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int arr[] = { 1,5,10,20,100};
        long n = scn.nextLong();
        int count =0;
        while (n!=0) {
            if (n>=100) {
                count++;
                n = n-100;
            }else if (n>=20) {
                count++;
                n = n-20;
            }else if (n>=10) {
                count++;
                n -= 10;

            }else if (n>=5) {
                count++;
                n -= 5;
            }else{
                count++;
                n -=1;
            }
        }

        System.out.println(count);
    }
}