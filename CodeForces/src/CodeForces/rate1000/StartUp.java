package CodeForces.rate1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * #420A URL: https://codeforces.com/problemset/problem/420/A
 * 
 * 鏡と一致する条件: 
 * 1. 構成される文字がすべて鏡文字であること 
 * 2. 文字列の順番を逆にしても同じ文字列として認識されること
 */
public class StartUp {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            StringBuffer buf = new StringBuffer(reader.readLine());
            StringBuilder builder = new StringBuilder(buf.toString());
            String reverseBuf = builder.reverse().toString();

            boolean flg = true;
            if (reverseBuf.equals(buf.toString())) {
                for (String s : reverseBuf.split("")) {
                    flg = MirrorChar.contain(s);
                    if (!flg) {
                        break;
                    }
                }
                
            } else {
                flg = false;
            }
            System.out.println(flg ? "YES" : "NO");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static enum MirrorChar {
        A("A"), H("H"),I("I"), M("M"), O("O"), T("T"), U("U"), V("V"), W("W"), X("X"), Y("Y");

        public String character;

        MirrorChar(String character) {
            this.character = character;
        }

        public String getCharacter() {
            return character;
        }

        public static boolean contain(String e) {
            for (MirrorChar value : MirrorChar.values()) {
                if (e.equals(value.getCharacter())) {
                    return true;
                }
            }
            return false;
        }

    }
}