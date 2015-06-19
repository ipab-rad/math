package com.rad.math.utils;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import static junitparams.JUnitParamsRunner.$;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class ArithmeticUtilsTest {

    private static final Object[] getModTestCases() {
        return $(
                $(0, 0, Double.NaN),
                $(0, 1, 0),
                $(1, 1, 0),
                $(1, 3, 1),
                $(5, 3, 2),
                $(5, 3, 2),
                $(5.55, 3, 2.55),
                $(-8, 5, 2),
                $(-3, 5, 2)
        );
    }

    @Test
    @Parameters(method = "getModTestCases")
    public void testMod(double m, double n, double expectedResult) {
        assertThat(ArithmeticUtils.mod(m, n)).isEqualTo(expectedResult);
    }

}