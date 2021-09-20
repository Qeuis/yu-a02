/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution10
 *  Copyright 2021 Danny Yu
 */

import java.util.Scanner;
import java.math.BigDecimal;

public class Solution10
{
    /*
        prompt user for input on prices of items
        prompt user for quantity of items
        call method to calculate subtotal and of items and prices
        call method to calculate tax of subtotal and add to total
        return subtotal, tax, and overall total
     */

    public static void main(String[] args)
    {
        Solution10 app = new Solution10();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the price of item 1: ");
        String price1 = input.nextLine();
        System.out.println("Enter the quantity of item 1: ");
        String quantity1 = input.nextLine();
        System.out.println("Enter the price of item 2: ");
        String price2 = input.nextLine();
        System.out.println("Enter the quantity of item 2: ");
        String quantity2 = input.nextLine();
        System.out.println("Enter the price of item 3: ");
        String price3 = input.nextLine();
        System.out.println("Enter the quantity of item 3: ");
        String quantity3 = input.nextLine();

        double item1Price = Double.parseDouble(price1);
        int item1Quantity = Integer.parseInt(quantity1);
        double item2Price = Double.parseDouble(price2);
        int item2Quantity = Integer.parseInt(quantity2);
        double item3Price = Double.parseDouble(price3);
        int item3Quantity = Integer.parseInt(quantity3);

        System.out.println("Subtotal: $" + app.calculateSubtotal(item1Price,item1Quantity,item2Price,item2Quantity,item3Price,item3Quantity));
        System.out.printf("Tax: $%.2f%n", app.calculateTax(item1Price,item1Quantity,item2Price,item2Quantity,item3Price,item3Quantity));
        System.out.printf("Total: $%.2f",app.total(item1Price,item1Quantity,item2Price,item2Quantity,item3Price,item3Quantity));

    }

    private double calculateSubtotal(double item1Price, int item1Quantity, double item2Price, int item2Quantity, double item3Price, int item3Quantity)
    {
        double Subtotal = ((item1Price * item1Quantity) + (item2Price * item2Quantity) + (item3Price * item3Quantity));
        return Subtotal;
    }

    private double calculateTax(double item1Price, int item1Quantity, double item2Price, int item2Quantity, double item3Price, int item3Quantity)
    {
        final double taxRate = 0.055;
        return ((item1Price * item1Quantity) + (item2Price * item2Quantity) + (item3Price * item3Quantity)) * taxRate;
    }

    private BigDecimal total(double item1Price, int item1Quantity, double item2Price, int item2Quantity, double item3Price, int item3Quantity)
    {
        double initialSubtotal;
        double initialTax;
        double initialTotal;
        final double taxRate = 0.055;
        double variable = (item1Price * item1Quantity) + (item2Price * item2Quantity) + (item3Price * item3Quantity);
        initialSubtotal = variable;
        initialTax = variable * taxRate;
        initialTotal = initialTax + initialSubtotal;
        return BigDecimal.valueOf(initialTotal);
    }
}
