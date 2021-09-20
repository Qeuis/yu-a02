/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution09
 *  Copyright 2021 Danny Yu
 */

import java.util.Scanner;

public class Solution09
{
    /*
        prompt user for length and width of room
        initialize variables
        calculate area of room
        divide area by constant
        round to the nearest whole number for gallon of paint from result
     */
    public static void main(String[] arg)
    {
        Solution09 app = new Solution09();
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the length of the room in feet:");
        String length = input.nextLine();
        System.out.println("Please enter the width of the room in feet:");
        String width = input.nextLine();

        double lengthOfRoom = Double.parseDouble(length);
        double widthOfRoom = Double.parseDouble(width);

        System.out.println("The area of your room is " + app.calculateArea(lengthOfRoom, widthOfRoom) + " feet.");
        System.out.println("You will need to purchase " + app.calculateGallonsOfPaint(lengthOfRoom, widthOfRoom) + " gallons of paint to cover " + app.calculateArea(lengthOfRoom, widthOfRoom) +  " feet.");

    }

    private double calculateArea(double lengthOfRoom, double widthOfRoom)
    {
        double squareFeetArea;
        squareFeetArea = lengthOfRoom * widthOfRoom;
        return squareFeetArea;
    }

    private double calculateGallonsOfPaint(double lengthOfRoom, double widthOfRoom)
    {
        final double gallonOfPaint = 350;
        return Math.ceil((lengthOfRoom * widthOfRoom) / gallonOfPaint);
    }
}
