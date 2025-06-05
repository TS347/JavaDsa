import java.util.*;
public class A_Word {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        String str = scn.next()
        ;
        int up = 0;
        int lc =0;
        for( int i =0;i<str.length() ; i++){
            if (str.charAt(i) == (Character.toUpperCase(str.charAt(i)))) {
                up++;
            }else{
                lc++;
            }
        }

        if (up>lc) {
            System.out.println(str.toUpperCase());
        }else{
            System.out.println(str.toLowerCase());
        }
    }
}