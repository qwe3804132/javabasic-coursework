package com.busyqa.coursework.wk2_tips;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String inStr;        // input String.
        int inStrLen;        // length of the input String.

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        inStr = in.next();   // use the next() method to read a String.
        inStrLen = inStr.length();

        String reverse = "";
        // Use inStr.charAt(index) in the loop to grab the character at the "index" from inStr.
        for (int i = inStrLen - 1; i >= 0; --i) {  // Process the String from the right side.
            reverse+=inStr.charAt(i);
        }

        System.out.printf("The reverse of the String \"%s\" is \"%s\".",inStr,reverse);
        /*
         * %s is a placeholder that represents a String.
         */
        in.close();
    }
}
