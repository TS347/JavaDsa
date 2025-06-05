import java.util.*;
public class A_Don_t_Try_to_Count {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int t = scn.nextInt();
        for( int i = 0;i<t ;i++){
        int n = scn.nextInt();
        int m = scn.nextInt();
        scn.nextLine();
        String str = scn.nextLine();
        // scn.next();

        String target = scn.nextLine();
       
        int count =0;
        
        if (str.contains(target)) {
                System.out.println(0);
                continue;
            }
            int k =0;
        // if (str.length()>=target.length()) {
        //     str += str;
        //     count++;
        //     if (str.contains(target)) {
        //         System.out.println(count);
        //         continue;
        //     }
        // }
                
               while (str.length()<= 2* m+n){
                    str = str+str;
                    count++;
                    if (str.contains(target)) {
                        System.out.println(count);
                        k=1;
                        break;
                    }
        
                }
                
           if (k==0) {
            System.out.println(-1);
           }
            
           
        }
    }
}