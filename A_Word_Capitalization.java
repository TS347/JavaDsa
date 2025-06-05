import java.util.*;
public class A_Word_Capitalization {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        String str = scn.next();
        // char ch = str.charAt(0);
        // char upch = Character.toUpperCase(ch);
        // String res = ""+upch; 
        // for( int i =1;i<str.length() ;i++){
        //     res += str.charAt(i);
        // }
        // System.out.println(res);
        //
        // Method
        
        if (str.length() ==0) {
            System.out.println("");
        }else{
            System.out.println(str.substring(0,1).toUpperCase() + str.substring(1));
        }
    
    }

}