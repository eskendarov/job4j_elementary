package ru.job4j.calculator;

import static java.lang.Double.sum;
import static ru.job4j.math.MathFunction.diff;
import static ru.job4j.math.MathFunction.div;
import static ru.job4j.math.MathFunction.multiply;

/**
 * MathCalculator Class description goes here.
 *
 * @author Enver Eskendarov
 * @version 1.0 24/05/2021
 */
public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double diffAndDiv(double first, double second) {
        return diff(first, second) + div(first, second);
    }

    public static double totalSum(double first, double second) {
        return sumAndMultiply(first, second) + diffAndDiv(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета sumAndMultiply равен: "
                + sumAndMultiply(10, 20)
        );
        System.out.println("Результат расчета diffAndDiv равен: "
                + diffAndDiv(10, 20)
        );
        System.out.println("Результат расчета totalSum равен: "
                + totalSum(10, 20)
        );
    }
}
