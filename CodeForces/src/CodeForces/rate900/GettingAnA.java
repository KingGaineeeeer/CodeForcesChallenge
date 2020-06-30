package CodeForces.rate900;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * https://codeforces.com/problemset/problem/991/B
 * DONE!
 */

public class GettingAnA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> gradeList = new ArrayList<Integer>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int grade = sc.nextInt();
            gradeList.add(grade);
        }

        if (Math.round(calcAve(gradeList)) == 5.0) {
            System.out.println(count);

        } else {
            
            while (calcAve(gradeList) < 4.5) {
                int min = Collections.min(gradeList);

                // replace the minnimum grade into 5 grade
                gradeList.set(gradeList.indexOf(min), 5);
                count++;
            }
            System.out.println(count);
        }

    }

    public static double calcAve(List<Integer> gradeList) {
        int sum = 0;
        for (int grade : gradeList) {
            sum += grade;
        }
        return (double) sum / (gradeList.size());
    }

}