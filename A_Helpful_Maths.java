import java.util.*;
public class A_Helpful_Maths {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        String s = scn.next();
        String str [] = s.split("\\+");// using delimiter and split function to convert string into an array 
        // by separating them at points where + sign occurs
        Arrays.sort(str);//sorting the string as per ascii value
        StringBuilder sb = new StringBuilder();
        for( int i =0;i<str.length ; i++){
            sb.append(str[i]);
            if (i<str.length-1) {
                sb.append('+');
            }
        }
        System.out.println(sb.toString());
    }
}