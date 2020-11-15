package com.busyqa.coursework.wk2_answer;

import java.util.Scanner;

@SuppressWarnings("unused")
public class GradesAverage {

    public static void main(String[] args) {
        int numInput = 0;
        int numStudent = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the number of students: ");

        numStudent = Integer.parseInt(in.next());   // use the next() method to read a String.

        int[] arrStudent = new int[numStudent]; // allocate memory for students' array.

        do {
            System.out.print("\nEnter the grade for student " + (numInput + 1) + " :");

            int grade = Integer.parseInt(in.next());   // use the next() method to read a String.

            //put the grade into the array based on the index. Note the index is incremented by one in each loop.
            if (grade >= 0 && grade <= 100) {
                arrStudent[numInput] = grade;
            } else {
                System.out.print("\nInvalid grade, try again!");
                continue;
            }

            numInput++;
        } while (numInput < numStudent);

        //sum up the array's elements.
        int sumup = 0;
        for (int index = 0; index < arrStudent.length; index++) {
        }

        // find the average.
        double average = sumup / (double)numStudent;

        // print the average.

        in.close();
    }
}
