package com.company;
        /*
        5. Design a class DistanceConverter

        methods
        - convertMilesToMeters
        - convertMetersToMiles

        - convertInchToCentimeter
        - convertCentimeterToInch

         */

public class DistanceConverter {
    public static double convertMilesToMeters(double miles) {
        double meters = 1609.34 * miles;
        return meters;
    }

    public static double convertMetersToMiles(double meters) {
        double miles = 0.0006213 * meters;
        return miles;
    }

    public static double convertInchToCentimeter(double inch) {
        double centimeter = 2.54 * inch;
        return centimeter;
    }

    public static double convertCentimeterToInch(double centimeter) {
        double inch = 0.3937 * centimeter;
        return inch;
    }


}
