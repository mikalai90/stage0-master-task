package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int a, b, c;
        c = number % 10;
        b = ((number - c) / 10) % 10;
        a = number / 100;
        System.out.println(c + "" + b + "" + a);
    }

}
