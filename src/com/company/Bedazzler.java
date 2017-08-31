package com.company;

public class Bedazzler {

    public static void main(String[] args) {
	// write your code here
        System.out.println(bedazzle("This is my string"));
    }

    public static String bedazzle(String inputStr) {
        String outputStr = "";

        for (int i = 0; i < inputStr.length(); i++) {

            // Put a * in front of every character
            outputStr += "*";

            char currentChar = inputStr.charAt(i);

            // If the character is a space, double it
            if (currentChar == ' ') {
                outputStr += "  ";
            } else {
                // otherwise, just copy the character
                outputStr += currentChar;
            }
        }

        // Add a trailing *
        outputStr += '*';

        return outputStr;
    }
}
