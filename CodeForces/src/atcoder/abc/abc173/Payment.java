package atcoder.abc.abc173;

import java.util.Scanner;

/**
 * abc17-A
 * AC!
 * https://atcoder.jp/contests/abc173/tasks/abc173_a
 */
public class Payment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yen = sc.nextInt();
        boolean flg = true;
        int i = 1;
        while(flg){
            
            int cg = 1000 * i - yen ;
            if(cg >=0){
                flg = false;
                System.out.println(cg);
            }
            i++;
        }
    }
}