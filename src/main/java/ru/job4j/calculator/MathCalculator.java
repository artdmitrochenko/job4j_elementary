package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumDifferenceAndDivision(double first, double second) {
        return difference(second, first)
                + division(second, first);
    }

    public static double sumMultiplyDifferenceDivision(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + difference(second, first)
                + division(second, first);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumDifferenceAndDivision(10, 20));
        System.out.println("Результат расчета равен: " + sumMultiplyDifferenceDivision(10, 20));
    }
}
