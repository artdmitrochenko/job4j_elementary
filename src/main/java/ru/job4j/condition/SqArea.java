package ru.job4j.condition;
public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double i = h * k;
        double s = i * h;
        return s;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
        double result2 = SqArea.square(12, 2);
        System.out.println(" p = 12, k = 2, s = 8, real = " + result2);
        double result3 = SqArea.square(18, 2);
        System.out.println(" p = 18, k = 2, s = 18, real = " + result3);
    }
}
