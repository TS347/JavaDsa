import java.util.*;

public class A_Doremy_s_Paint_3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for (int j = 0; j < t; j++) {
            int n = scn.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(scn.nextInt());
            }

            ArrayList<Integer> unique = new ArrayList<>();
            ArrayList<Integer> freq = new ArrayList<>();

            // Count frequencies manually
            for (int i = 0; i < arr.size(); i++) {
                int val = arr.get(i);
                if (!unique.contains(val)) {
                    unique.add(val);
                    int count = 0;
                    for (int k = 0; k < arr.size(); k++) {
                        if (arr.get(k) == val) {
                            count++;
                        }
                    }
                    freq.add(count);
                }
            }

            if (freq.size() > 2) {
                System.out.println("No");
            } else if (freq.size() == 1) {
                System.out.println("Yes");
            } else {
                int f1 = freq.get(0);
                int f2 = freq.get(1);
                if (n % 2 == 0) {
                    if (f1 == f2) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                } else {
                    if (Math.abs(f1 - f2) == 1) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                }
            }
        }
    }
}
