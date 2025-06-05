import java.util.*;
public class A_Boy_or_Girl {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        String str = scn.next();
        
        String res = "";
        for( int i =0;i<str.length() ; i++){
            char ch = str.charAt(i);
            int flag = 0;
            for( int j =0 ; j<res.length() ; j++){
                if (ch == res.charAt(j) ) {
                    flag = 1;
                    break;
                }
            }
            if (flag ==0) {
                  res+= ch;
            }
          

        }
        int l = res.length();
        if (l %2==0) {
            System.out.println("CHAT WITH HER!");
        }else System.out.println("IGNORE HIM!");
    }
}