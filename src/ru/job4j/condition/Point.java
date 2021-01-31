package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int dX = x2 - x1;
        int dY = y2 - y1;
        return Math.sqrt(Math.pow(dX, 2) + Math.pow(dY, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
