import java.util.*;
public class A_Beautiful_Year {

    public static boolean check( int n ){
        String str = Integer.toString(n);
        for( int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            for( int j =i+1; j<str.length();j++){
                if (ch == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        n++;
        while (true) {
            if (check(n)) {
                System.out.println(n);
                break;
            }
            n++;
        }
        
}
}