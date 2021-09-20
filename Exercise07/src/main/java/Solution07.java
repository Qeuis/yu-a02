/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution07
 *  Copyright 2021 Danny Yu
 */

import java.util.Scanner;

public class Solution07
{
    /*
        prompt user for length and width of room in feet
        convert string input into integer datatype
        hold constant conversion factor
        method call to calculate square feet
        method call to calculate square meters
        output area of room in square feet and square meters
     */
    public static void main(String[] args)
    {
        Solution07 app = new Solution07();
        Scanner input = new Scanner(System.in);
        System.out.println ("What is the length of the room in feet?");
        String length = input.nextLine();
        System.out.println ("What is the width of the room in feet?");
        String width = input.nextLine();

        final double conversion = 0.09290304;
        double lengthRoom = Double.parseDouble(length);
        double widthRoom = Double.parseDouble(width);

        System.out.println("You entered dimensions of " + lengthRoom + " feet by " + widthRoom + " feet.");
        System.out.println("The area of your room is: ");
        System.out.println(app.calculateArea(lengthRoom, widthRoom) + " square feet");
        System.out.printf("%.3f square meters", app.convertArea(lengthRoom, widthRoom, conversion));
    }

    private double calculateArea(double lengthRoom, double widthRoom)
    {
        double areaFeet;
        areaFeet = lengthRoom * widthRoom;
        return areaFeet;
    }

    private double convertArea(double lengthRoom, double widthRoom, double conversion)
    {
        double areaMeters;
        areaMeters = (lengthRoom * widthRoom) * conversion;
        return areaMeters;
    }

}
