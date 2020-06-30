package CodeForces.rate1100;

import java.io.IOException;
import java.util.*;

/** 継続条件を複雑に考えてしまうとコーディングが複雑になる。
 * まずは紙に継続条件を書き出して、数学的知識とアルゴリズムの部分を分離させること。数学的なところがは調べてわかる。
 * アルゴリズムのところはソースをどう書いたらきれいになるかではないことに注意。
 * 
 * 数学的知識から追加で何がわかればアルゴリズムが成り立つかを考える。
 * 
 */
public class FancyFence {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.println(360 % (180 - sc.nextInt()) == 0 ? "YES" : "NO");
        }
    }
}
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// /**
//  * #270A URL: https://codeforces.com/problemset/problem/270/A Name:Fancy Fence
//  */
// public class FancyFence {

//     public static void main(String[] args) {
//         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//         try {
//             int t = Integer.parseInt(reader.readLine());

//             for (int i = 3; i < t + 3; i++) {
//                 int degree = Integer.parseInt(reader.readLine());
//                 double singleDegree = calcSingleDeg(i);
//                 boolean polygonFlg = false;
//                 int j = 3;
//                 while (calcSingleDeg(j) < 180 && (180*j) % calcSingleDeg(j) == 0) {

//                     if (calcSingleDeg(j) == (double) degree) {
//                         polygonFlg = true;
//                     }
//                     j++;
//                 }
//                 System.out.println(print(polygonFlg));
//             }

//         } catch (NumberFormatException e) {
//             e.printStackTrace();
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }

//     public static double calcSingleDeg(int n) {
//         return 180 - 360 / n;
//     }

//     public static String print(boolean polygonFlg) {
//         return polygonFlg ? "YES" : "NO";

//     }

// }
