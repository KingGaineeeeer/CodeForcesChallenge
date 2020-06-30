package CodeForces.rate1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
/** 
 * score: WA (#4)
 * 
 * 1. 場合分けすべし。
 *  数字毎にどんなペアが考えられるか、実際に試してみること。
 * 
 * 2. いくつかのパターンの中で、どういうカウントの仕方をすれば値が正しくカウントされるかを見出す。共通点、頭の中で何をしているかを論理的に書き出す。
 * 
 * 3. javaでどのように書くことができるか。
 * 
 * 
*/
public class Taxi {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(reader.readLine());
            String[] str = reader.readLine().split(" ");
            int[] num = new int[4];
            Arrays.fill(num, 0);
            int numb;
            for (int j = 0; j < N; j++) {
                numb = Integer.parseInt(str[j]);
                switch (numb) {
                    case 1:
                        num[0]++;
                        break;
                    case 2:
                        num[1]++;
                        break;
                    case 3:
                        num[2]++;
                        break;
                    case 4:
                        num[3]++;
                        break;
                }
            }
            int ans = 0;
            // それぞれの数で必要な車の数を計算
            //4に必要な数
            ans += num[3];
            //3
            // 3の数　＝　車の数にするので、1と共存する分は1のcaseでうまく調整する。
            ans += num[2];
            //2
            ans += (num[1] + 1) / 2;
            //1
            if (num[0] > num[2]) {
                num[0] -= num[2];
                // 1と共存する2が1つあった場合、(1,1,2)のペアができるので1の数を2つ減らす
                if ((num[1] & 1) == 1) {
                    num[0] -= 2;
                }

                // ここまでくると、配列はすべて1だけになっているので、1111のペアを作り、その数を数える
                if (num[0] > 0) {
                    ans += (num[0] + 3) / 4;
                }
            }
            System.out.println(ans);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


// import java.io.IOException;
// import java.util.ArrayList;
// import java.util.Comparator;
// import java.util.List;
// import java.util.Scanner;
// import java.util.stream.Collectors;

/**
 * https://codeforces.com/problemset/problem/158/B
 * 　GiveUp...
 *   Answer is below. 
 * 
 */
// public class Taxi {
//     public static void main(String[] args) throws IOException {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         ArrayList<Integer> list = new ArrayList<Integer>();
//         for (int i = 0; i < num; i++) {
//             list.add(sc.nextInt());
//         }

//         // Sort by desk
//         List<Integer> sorted = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//         int count = 0;
//         for (int i = 0; i < sorted.size(); i++) {
//             switch (sorted.get(i)) {
//                 case 4:
//                     count++;
//                     break;
//                 case 3:
//                     Integer one = sorted.stream().filter(v -> v.equals(1)).findFirst().orElse(0);

//                     if (one == 1) {
//                         sorted.remove(sorted.get(sorted.indexOf(one)));
//                     }
//                     count++;
//                     break;
//                 case 2:
//                     for (int j = i + 1; j < sorted.size(); j++) {
//                         if (sorted.get(j) == 2) {
//                             sorted.remove(sorted.get(j));
//                         } else if (sorted.get(j) == 1) {
//                             sorted.remove(sorted.get(j));
//                         }
//                     }
//                     count++;
//                     break;
//                 case 1:
                    
//             }
//             // 1のときが未考慮。4になるまで1をタス処理を追記。

//         }
//         System.out.println(count);

//     }
// }