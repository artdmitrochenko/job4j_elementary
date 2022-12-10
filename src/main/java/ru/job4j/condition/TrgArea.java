package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        double area = TrgArea.area(5, 7, 11);
        System.out.println("area (5, 7, 11) = " + area);
    }
}
