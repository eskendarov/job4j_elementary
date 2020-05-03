package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * @author Enver Eskendarov (envereskendarov@gmail.com)
 */
public class Point {

    private int x;
    private int y;
    private int z;

    /**
     * Конструтор, который принимает начальное состояние объекта "точка"
     *
     * @param first  координата x
     * @param second координата y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * Конструтор, который принимает начальное состояние объекта "точка"
     *
     * @param first  координата x
     * @param second координата y
     * @param third  координата z
     */
    public Point(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }

    public double distance(Point that) {
        double rsl;
        if (this.x == 0 && that.x == 0) {
            rsl = sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
        } else {
            rsl = sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
        }
        return rsl;
    }

//    public double distance3d(Point that) {
//        double rsl = sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
//        System.out.println(rsl);
//        return rsl;
//
//    }
}