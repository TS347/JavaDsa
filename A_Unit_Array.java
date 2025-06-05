import java.util.*;

public class A_Unit_Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for (int j = 0; j < t; j++) {
            int n = scn.nextInt();
            int arr[] = new int[n];
            int op = 0;
            int nc = 0;
            int pc = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
                
                if (arr[i] == -1) {
                    nc++;
                }else{
                    pc++;
                }
            }

            //  sum kae liye pc>= nc
            // roduct kae liye nc%2 ==0

            while (pc < nc || nc%2 !=0) {// good use of operators
                pc++;
                nc--;
                op++;
            }
            System.out.println(op);
        }
    }
}
