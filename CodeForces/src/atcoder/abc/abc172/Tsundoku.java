package atcoder.abc.abc172;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tsundoku {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> minAList = new ArrayList<Integer>();
        ArrayList<Integer> minBList = new ArrayList<Integer>();
        int minus = 0;
        while (n-- > 0) {
            minAList.add(sc.nextInt());
        }
        while (m-- > 0) {
            minBList.add(sc.nextInt());
        }
        if (sum(minAList) > sum(minBList)) {
            minus = sum(minBList);

        } else {
            minus = sum(minAList);
        }

    }

    public static int sum(List<Integer> list) {
        int sum = 0;
        for (int a : list) {
            sum = +a;
        }
        return sum;
    }

    // TODO: ここの取り出しのところ頭の中で描いた簡単なアルゴリズムでやってしまったので、設計しなおした方がよさそう。
    // いったんコメントにあるとおりにやるか、ほかのやり方ないかを確認。今はA全部orB全部orAとB常に交互に小さいものを手に取っていく方法でやっている。
    // 問題は一番上の数だけ見ていると下に1分とかの本が眠っていた時に損するってところ。下に眠っている軽い本をどうやって考慮するかがキーぽいんT

    public static int sumFromBoth(List<Integer> a, List<Integer> b) {
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
                if (a.get(i) < b.get(i)) {
                    // pop a
                    MyStack.pop();
                } else if (a.get(i) > b.get(i)) {
                    // pop b
                    MyStack
                } else if (a.get(i) == b.get(i)) {
                    // pop i+1 a or i+1 b
                }
            }

        }
    }

    public static class MyStack {
        public int[] data;
        public int pt;

        public void push(int a) {
            if (pt <= 0) {
                throw new RuntimeException("stack empty.");
            }
            data[pt] = a;
            pt--;
        };

        public static int pop() {
            if (pt >= data.length) {
                throw new RuntimeException("stack full.");
            }
            pt++;
            int a = data[pt];
            data[pt] = 0;
            return a;

        };
    }
}