import java.util.*;
public class A_Bit {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int t = scn.nextInt();
        scn.nextLine();
        int x = 0;

        for( int i =0;i<t ; i++){
            String str = scn.nextLine();
            if (str.charAt(0) =='+' || str.charAt(2) =='+') {
                x++;
            }else{
                x--;
            }

        }
        System.out.println(x);
    }
}