import java.util.*;
public class A_Way_Too_Long_Words {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);int t = scn.nextInt();
        scn.nextLine();
        for( int i =0;i<t ;i++){
            String str = scn.nextLine();
            int l = str.length();
            if (l<=10) {
                System.out.println(str);
            }else{
                char c1 = str.charAt(0);
                char c2 = str.charAt(l-1);
                int l2 = l-2;
                String s = Integer.toString(l2);
                System.out.println(c1+s+c2);
            }
        }
    }
}