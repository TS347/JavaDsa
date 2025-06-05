import java.util.*;
public class C_Prepend_and_Append {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int t = scn.nextInt();
        for( int j =0;j<t;j++){
            int n  = scn.nextInt();
            scn.nextLine();
            String str = scn.nextLine();
            StringBuilder sb = new StringBuilder(str);
            int op =0;
           for( int i =0;i<n/2;i++){
            char fp = sb.charAt(i);
            char bp = sb.charAt(n-1-i);
            if (fp =='1' && bp =='0') {
                op++;
            }else if (fp =='0' && bp =='1'){
                op++;
            }else {
                break;
            }

           }
           System.out.println(n-2*op);
        }
    }
}