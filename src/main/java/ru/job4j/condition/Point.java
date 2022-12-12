package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 1, 2, 3);
        System.out.println("result (0, 1) to (2, 3) " + result);
        double result2 = Point.distance(4, 5, 6, 7);
        System.out.println("result (4, 5) to (6, 7) " + result2);
        double result3 = Point.distance(8, 9, 10, 11);
        System.out.println("result (12, 13) to (14, 15) " + result3);
    }
}
