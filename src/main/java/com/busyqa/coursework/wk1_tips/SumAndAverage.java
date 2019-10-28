package com.busyqa.coursework.wk1_tips;

import java.util.Locale;

public class SumAndAverage {
    public static void main (String[] args) {
        int sum = 0;          // Store the accumulated sum, init to 0
        double average;       // average in double
        int lowerbound = 1;   // The lowerbound to sum
        int upperbound = 100; // The upperbound to sum

        // Use a for-loop to sum from lowerbound to upperbound
        for (int number = lowerbound; number <= upperbound; ++number) {
            sum += number;     // same as "sum = sum + number"
        }
        // Compute average in double. Beware that int/int produces int.
        average = sum / 100.0;
        
        // Print sum and average.
        // Locale.ROOT makes the decimal separator to be a point.
        System.out.printf(Locale.ROOT, "The sum is %d. The average is %.2f.", sum, average);
    }
}
