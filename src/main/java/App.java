/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Gershman
 */

import java.util.Calendar;
import java.util.Scanner;

public class App
{
    public static String GetInput(String request) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(request);
        return scanner.nextLine();
    }

    public static void main( String[] args )
    {
        String curAgeString = GetInput("What is your current age? ");
        int curAge = Integer.parseInt(curAgeString);

        String retAgeString = GetInput("At what age would you like to retire? ");
        int retAge = Integer.parseInt(retAgeString);

        int yearsLeft = retAge - curAge;

        if (yearsLeft <= 0) {
            System.out.print("You can already retire!");
        }
        else {
            int curYear = Calendar.getInstance().get(Calendar.YEAR);

            int retYear = curYear + yearsLeft;

            System.out.println("You have " + yearsLeft + " years left until you can retire.");
            System.out.println("Its " + curYear + ", so you can retire in " + retYear + ".");
        }
    }
}