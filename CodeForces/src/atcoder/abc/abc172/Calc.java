package atcoder.abc.abc172;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * A https://atcoder.jp/contests/abc172/tasks/abc172_a
 * BufferedReaderの方が40msくらい早かった。メモリ消費も若干抑えられてる様子。
 * 
 */
public class Calc {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            int a = Integer.parseInt(reader.readLine());
            System.out.println((int) (a + Math.pow(a, 2) + Math.pow(a, 3)));
        } catch (NumberFormatException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}