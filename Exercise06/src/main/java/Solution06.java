/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution06
 *  Copyright 2021 Danny Yu
 */

import java.util.Scanner;
import java.time.LocalDate;

public class Solution06
{
    /*
        initialize variables
        prompt user for age and expected retirement age
        call method to calculate and return value of expected retirement age
        get local system time
        calculate local system year and retirement years to output expected year to retire
        output local system year to expected year of retirement
     */
    public static void main(String[] args)
    {
        Solution06 app = new Solution06();
        Scanner number = new Scanner(System.in);
        System.out.print("Enter your current age: ");
        String currentAge = number.nextLine();
        System.out.print("Enter the age you want to retire: ");
        String retireAge = number.nextLine();

        int age = Integer.parseInt(currentAge);
        int retire = Integer.parseInt(retireAge);

        LocalDate current = LocalDate.now();
        int currentYear = current.getYear();

        System.out.println("You have " + app.calculate(retire, age) + " years until you can retire.");
        System.out.println("It is " + currentYear + " so you can retire in " + (currentYear + app.calculate(retire, age)) + ".");
    }

    private int calculate(int retire, int age)
    {
        int retirementYears;
        retirementYears = retire - age;
        return retirementYears;
    }
}
