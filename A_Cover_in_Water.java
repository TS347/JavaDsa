import java.util.*;
public class A_Cover_in_Water {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int t = scn.nextInt();
       
        for( int j= 0;j<t;j++){
            int n = scn.nextInt();
             scn.nextLine();;
            String str = scn.nextLine();
            boolean continuous_dot = false;
            int count = 0;
            for (int i =0;i<n;i++){
                if (((str.charAt(i) =='.') && i+1<n)  && ((str.charAt(i+1) =='.') && i+2<n)
                &&(str.charAt(i+2) =='.') ) {
                    continuous_dot =  true ;
                    break;
                }if (str.charAt(i) =='.') {
                    count++;
                }
            }

            if (continuous_dot == true) {
                System.out.println(2);
            }else{
                System.out.println(count);
            }
        }
    }
}