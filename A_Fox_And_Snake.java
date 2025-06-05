import java.util.*;
public class A_Fox_And_Snake {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        int m  = scn.nextInt();
        for( int i =0;i<n;i++){
            
                if (i%2==0) {
                    for( int j =0;j<m ;j++)
                    System.out.print("#");
                }else if (i>2 && (i+1)%4 ==0) {

                    // left hash
                    for( int k =0;k<m;k++){
                        if (k==0) {
                            System.out.print("#");
                        }else{
                            System.out.print(".");
                        }
                    }
                }
                
                else{
                    for( int k =0;k<m ;k++){
                        if (k==m-1) {
                            System.out.print("#");
                        }else{
                            System.out.print(".");
                        }
                    }
                }
                System.out.println();
            }
            
        }
    }
