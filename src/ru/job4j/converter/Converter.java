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

        System.out.println("Tests:");

        int in = 1000;
        int expected = 14;
        int out = Converter.rubleToEuro(in);
        boolean passed = out == expected;
        System.out.println("1000 rubles are 14 euros. Test result: " + passed);

        in = 1000;
        expected = 16;
        out = Converter.rubleTooDollar(in);
        passed = out == expected;
        System.out.println("1000 rubles are 16 dollars. Test result: " + passed);

    }
}