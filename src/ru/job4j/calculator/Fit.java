package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) { // рост в см
        return (height - 100) * 1.15;
    }


    public static double womanWeight(double height) { // рост в см
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight(180);
        double woman = Fit.womanWeight(160);
        System.out.println("Man 100 is " + man);
        System.out.println("Woman 100 is " + woman);
    }
}
