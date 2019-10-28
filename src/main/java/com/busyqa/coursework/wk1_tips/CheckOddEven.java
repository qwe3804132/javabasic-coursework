package com.busyqa.coursework.wk1_tips;

public class CheckOddEven {
    public static void main(String[] args) {  // Program entry point
        int number = 50;       // Set the value of "number" here!
        System.out.println("The number is " + number);
        if ( (number%2)==0 ) {
            System.out.println( "EVEN" );
        } else {
            System.out.println( "ODD" );
        }
        System.out.println( "done" );
    }
}
