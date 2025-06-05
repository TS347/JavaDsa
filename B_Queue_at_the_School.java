import java.util.*;
public class B_Queue_at_the_School {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int t =scn.nextInt();
        scn.nextLine();
        String str = scn.next();
        char ch [] = str.toCharArray();
        for( int i =t;i>0 ; i--){
            int j =0;
           while( j<n-1){
                char ch1 = ch[j];//sSwaps value of ch1 and ch2 and not the elemnts of the array
                char ch2 = ch[j+1];
                if ((ch1 =='B') && (ch2 =='G')) {
                    char temp = ch[j+1];
                    ch[j+1] = ch[j];
                    ch[j] = temp;
                    j+=2;
                }else
                j++;
            }
        }
        System.out.println(new String(ch));
    }
}