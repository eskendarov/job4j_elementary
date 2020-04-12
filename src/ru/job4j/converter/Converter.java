package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70; // формула перевода рублей в евро.
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; // формула перевода рублей в доллоры.
        return rsl;
    }

    public static int euroToRuble(int value) {
        int rsl = value * 70; // формула перевода евро в рубли.
        return rsl;
    }

    public static int dollarToRuble(int value) {
        int rsl = value * 60; // формула перевода доллоров в рубли.
        return rsl;
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
    }
}
