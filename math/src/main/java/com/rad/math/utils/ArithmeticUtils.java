package com.rad.math.utils;

public class ArithmeticUtils {
    /**
     * Modular arithmetic: m mod n
     * @param m
     * @param n
     * @return m mod n
     */
    public static double mod(double m, double n){
        double result = m % n;
        return result < 0 ? result + n : result;
    }
}
