package Atcoder.beginnersection;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ABC086C
 * 
 */
public class Traveling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Point> pointList = new ArrayList<Point>();

        // add default point
        pointList.add(new Point(0, 0, 0));

        for (int i = 0; i < n; i++) {
            Point point = new Point(sc.nextInt(), sc.nextInt(), sc.nextInt());
            pointList.add(point);
        }

        for (int nPoint = 0; nPoint < n; nPoint++) {
            // distance of between 2 points
            int d = Math.abs(pointList.get(nPoint).getX() - pointList.get(nPoint + 1).getX())
                    + Math.abs(pointList.get(nPoint).getY() - pointList.get(nPoint + 1).getY());
            // time lag
            int t = pointList.get(nPoint + 1).getT() - pointList.get(nPoint).getT();

            if (d > t || (d - t) % 2 != 0) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
        sc.close();

    }

    private static class Point {

        private int t;
        private int x;
        private int y;

        public Point(int t, int x, int y) {
            this.t = t;
            this.x = x;
            this.y = y;
        }

        public int getT() {
            return this.t;
        }

        public int getX() {
            return this.x;
        }

        public int getY() {
            return this.y;
        }

        public String toString() {
            return "(t,x,y): " + t + x + y;
        }

    }
}