/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution08
 *  Copyright 2021 Danny Yu
 */

import java.util.Scanner;

public class Solution08
{
    /*
        prompt user for amount of people at party, pizzas brought, and slices per pizza
        convert string input to integer datatype
        method call to calculate slices per person
        method call to calculate leftover slices
        output how many people attended party with pizza and slices amount
        output slices per person
        output leftover slices
     */

    public static void main(String[] args)
    {
        Solution08 app = new Solution08();
        Scanner input = new Scanner(System.in);
        System.out.println("How many people are at the party?");
        String people = input.nextLine();
        System.out.println("How many pizzas were brought to the party?");
        String pizzas = input.nextLine();
        System.out.println("How many slices per pizza?");
        String slices = input.nextLine();

        int numPeople = Integer.parseInt(people);
        int numPizza = Integer.parseInt(pizzas);
        int numSlices = Integer.parseInt(slices);

        System.out.println(numPeople + " people with " + numPizza + " pizzas " + "(" + app.totalSlices(numSlices, numPizza) + " slices" + ") are at a party." );
        System.out.println("Each person gets " + app.receivedSlices(numPeople, numSlices, numPizza) + " slices of pizza.");
        System.out.println("There are " + app.leftoverSlices(numPeople, numSlices, numPizza) + " leftover slices.");


    }

    private int totalSlices(int numSlices, int numPizza)
    {
         int totalSlices;
         totalSlices = numSlices * numPizza;
         return totalSlices;
    }

    private int receivedSlices (int numPeople, int numSlices, int numPizza)
    {
        int perSlice;
        perSlice = (numSlices * numPizza) / numPeople;
        return perSlice;
    }

    private int leftoverSlices (int numPeople, int numSlices, int numPizza)
    {
        int leftover;
        leftover = (numSlices * numPizza) % numPeople;
        return leftover;
    }

}
