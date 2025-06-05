import java.util.*;
public class A_Nearly_Lucky_Number {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        long n = scn.nextLong();
        int count = 0;
        while (n>0) {
            long ld = n%10;
            n = n/10;
            if (ld ==4 || ld ==7) {
                count++;
            }
        }

        if (count ==4 || count ==7) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}