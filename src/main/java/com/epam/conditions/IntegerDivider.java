package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        int resultOfDivision;
        int resultOfMultiple;

        if (divider == 0) System.out.println("division by zero");
        else {
            resultOfDivision = dividend / divider;
            resultOfMultiple = resultOfDivision * divider;
            if (resultOfMultiple == dividend) System.out.println("can be divided completely");
            else System.out.println("cannot be divided completely");
        }


    }

}
