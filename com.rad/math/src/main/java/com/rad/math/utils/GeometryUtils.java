package com.rad.math.utils;

import static com.rad.math.utils.ArithmeticUtils.mod;
import static java.lang.Math.PI;

public class GeometryUtils {
    /**
     * Apply offset to an angle whilst keeping the angle with the range [-PI, PI)
     * e.g. PI + 1 === -PI + 1 and -PI - 1 === PI - 1
     * @param currentAngle in Radians
     * @param offsetAngle in Radians
     * @return modified angle in Radians within [-PI, PI)
     */
    public static double applyOffset(double currentAngle, double offsetAngle){
        double difference = currentAngle + PI - offsetAngle;
        return mod(difference, 2 * PI)- PI;
    }
}
