package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean condition = left > right;
        return left > right ? left : right;
    }

    public static void main(String[] args) {
        int result = Max.max(1, 2);
        System.out.println("Max number: " + result);
        result = Max.max(2, 2);
        System.out.println("Both expressions are equal: " + result);
    }
}
