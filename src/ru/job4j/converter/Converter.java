package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(180);
        int ruble = Converter.dollarToRuble(43);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("180 rubles are " + dollar + " dollars.");
        System.out.println("43 dollars are " + ruble + " rubles.");
        ruble = Converter.euroToRuble(13);
        System.out.println("13 euro are " + ruble + " rubles.");

        System.out.println("Tests:");
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 Euro. Test result : " + passed);
        in = 180;
        expected = 3;
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("180 rubles are 3$. Test result : " + passed);
        in = 43;
        expected = 2555; // подставим ложное ожидание
        out = dollarToRuble(in);
        passed = expected == out;
        System.out.println("43 dollars are 2555 Rub. Test result : " + passed);
    }
}
