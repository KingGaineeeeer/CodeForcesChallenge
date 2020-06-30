package CodeForces.rate800;

import java.util.Scanner;

public class WordAbbreviation {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(num);
        in.nextLine();
        for (int i = 0; i < num; i++) {

            // 実行時引数を順に取り出して文字数をカウントしていく
            String target = in.nextLine();

            if (target.length() > 10) {
                StringBuilder abbreviate = new StringBuilder();
                abbreviate.append(target.charAt(0));
                abbreviate.append(String.valueOf(target.length() - 2));
                abbreviate.append(target.charAt(target.length() - 1));
                System.out.println("abbreviate:"+abbreviate);

            } else {
                System.out.println("taeget:"+target);
            }
            in.close();
        }
    }

}