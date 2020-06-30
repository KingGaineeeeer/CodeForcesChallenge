package Atcoder.beginnersection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ABC081B
 * 配列内の数字がすべて偶数であれば配列内の各要素を2で割り続け、
 * 配列内の要素に奇数の要素が現れた時点で、ループを中断し、要素を割った回数を返すプログラムです。
 */
public class ShiftOnly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        ArrayList<Long> numList = new ArrayList<Long>();
        for (int i = 0; i < num; i++) {
            numList.add(sc.nextLong());
        }

        while (isEven(numList)) {
            getDiveded(numList, count);
            count++;
        }
        System.out.println(count);
        sc.close();
    }

    public static List<Long> getDiveded(List<Long> numList, int count) {
        for (Long i : numList) {
            var element = Long.divideUnsigned(i, 2);
            numList.set(numList.indexOf(i), element);
        }
        return numList;
    }

    public static boolean isEven(List<Long> numList) {
        for (Long i : numList) {
            if (i % 2 == 1) {
                return false;
            }
        }
        return true;
    }
}