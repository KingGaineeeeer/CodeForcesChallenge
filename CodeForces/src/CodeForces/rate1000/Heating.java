package CodeForces.rate1000;

import java.util.*;

public class Heating {

    /**
     * URL:https://codeforces.com/problemset/status/1260/problem/A
     * 
     * Answer&Tutorial: https://codeforces.com/blog/entry/71805
     * Score: N/A
     */
    public static int slv(int n, int m) {
        int x = m % n;
        int y = n - x;
        int z = m / n;
        return x * (z + 1) * (z + 1) + y * z * z;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            System.out.println(slv(n, m));
        }

    }
}