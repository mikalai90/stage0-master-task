package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int a, b, c, d;
        d = number % 10;
        c = ((number - d) / 10) % 10;
        b = ((number - c * 10 - d) / 100) % 10;
        a = number / 1000;
        System.out.println(a + b + c + d);
    }

}
