package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide){
        if (firstSide + secondSide < thirdSide || firstSide + thirdSide < secondSide || secondSide + thirdSide < firstSide || firstSide <=0 || secondSide <= 0 || thirdSide <= 0) {
            System.out.println("it's not a triangle");
        } else {
            System.out.println("this is a valid triangle");
        }

    }

}
