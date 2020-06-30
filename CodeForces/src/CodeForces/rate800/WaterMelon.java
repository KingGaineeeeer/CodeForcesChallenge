package CodeForces.rate800;

import java.util.Scanner;

public class WaterMelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = false;

        if (num % 2 == 0 && num!= 2) {
            flag = true;
        } else {
            for (int i = 2; i < num; i += 2) {
                if ((num - i) % 2 == 0) {
                    flag = true;
                }
            }
        }
        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }

}