package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleTooDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(1000);
        System.out.println("1000 rubles are " + euro + " euros.");
        int dollar = Converter.rubleTooDollar(1000);
        System.out.println("1000 rubles are " + dollar + " dollars.");
    }
}