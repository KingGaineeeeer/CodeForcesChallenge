package Atcoder.beginnersection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**　
 * ABC081A
 * 二値(0,1)で入力された複数の数値の中に、1がいくつあるかを返すプログラムです。
 */
public class PlacingMarbles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> argList = stringConvertToArray(sc.next());
        int count = 0;
        for (String c : argList) {
            if (c.equals("1")) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();

    }


    public static List<String> stringConvertToArray(String arg) {
        ArrayList<String> argList = new ArrayList<String>();
        for (int i = 0; i < arg.length(); i++) {
            argList.add(String.valueOf(arg.charAt(i)));
        }
        return argList;
    }

}