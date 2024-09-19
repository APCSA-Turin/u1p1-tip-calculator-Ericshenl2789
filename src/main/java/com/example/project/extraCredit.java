package com.example.project;
import java.util.Scanner;

public class extraCredit {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        
        double tip = Math.round(cost * percent + 0.5) / 100.0; //learned from https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java
        double totalBill = cost + tip;
        double perPersonCost = Math.round(cost / people * 100 + 0.05) / 100.0;
        double tipPerPerson = Math.round(tip / people * 100 + 0.05) / 100.0;
        double totalCostPerPerson = (int)(totalBill / people * 100) / 100.0;

        
        result.append("-------------------------------\n");
        result.append("Total bill before tip: " + "$" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: " + "$" + tip + "\n");
        result.append("Total Bill with tip: " + "$" + totalBill + "\n");
        result.append("Per person cost before tip: " + "$" + perPersonCost + "\n");
        result.append("Tip per person: " + "$" + tipPerPerson + "\n");
        result.append("Total cost per person: " + "$" + totalCostPerPerson + "\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 12; 
        int percent = 15;
        double cost = 566.97;              
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
