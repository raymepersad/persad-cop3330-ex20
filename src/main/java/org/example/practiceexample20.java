/*
 *   UCF COP3330 SUMMER 2021 ASSIGNMENT 12 SOLUTION
 *   COPYRIGHT 2021 RAYME PERSAD
 */

/*Create a tax calculator that handles multiple states and multiple counties within each state.
The program prompts the user for the order amount and the state where the order will be shipped.


Wisconsin residents must be changed 5% sales tax with an additional county-level charge.
For Wisconsin residents, prompt for the county of residence.
For Eau Claire county residents, add an additional 0.005 tax.
For Dunn county residents, add an additional 0.004 tax.

Illinois residents must be charged 8% sales tax with no additional county-level charge.

All other states are not charged tax.
The program then displays the tax and the total for Wisconsin and Illinois residents but just the total for everyone else.

 */




package org.example;
import java.util.Scanner;

public class practiceexample20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int amount;
        double tAmount = 0.0, tax = 0.0; // declare variables

        System.out.print("What is order amount? "); //prompt order amount
        amount = sc.nextInt();
        System.out.print("What state do you live in? "); //prompt state
        String state = sc.next();

        if(state.equals("Wisconsin"))
        {
            System.out.print("What country do you live in? "); //prompt country
            String county = sc.next();

            if(county.equals("EauClaire")) //enters in Euclaire
            {
                tax = (amount*5.005)/100; //tax amount of 0.005 extra
                tAmount = tax + amount;
            }

            else if(county.equals("Dunn"))
            {
                tax = (amount*5.004)/100; // tax amount of 0.004 extra
                tAmount = tax + amount;
            }

            else
            {
                System.out.println("Please enter correct country"); //prompt when user enters anything but euclaire or dunn
            }
        }

        else if(state.equals("Illinois")) // prompt of illinois is entered
        {
            tax = (amount*8)/100;
            tAmount = tax + amount;
        }
        else
        {
            tax = 0.0; //returns 0 for tax rate if any other state is entered
            tAmount = amount;
        }
        System.out.println("The tax is  $"+String.format("%.2f",tax)); //tax printed to 2 decimal places
        System.out.println("The total is  $"+String.format("%.2f",tAmount)); //amount printed to 2 decimal places
    }
}

