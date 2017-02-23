package com.hypercubesoft.magicfragmentslibrary;

import java.util.ArrayList;

/**
 * Created by Aleksandar Marinkovic on 23-Feb-17.
 * Copyright by Hypercube d.o.o.
 * www.hypercubesoft.com
 */

public class Dummy {
    private static Dummy ourInstance = new Dummy();

    public static Dummy getInstance() {
        return ourInstance;
    }
    private ArrayList<Integer> fibonacciArray;

    public   Dummy() {


    }

    public int[] fibonacci(int value) {
        int[] fibNumbers = new int[] {0, 1};
        // Set your condition of how many numbers you want to create, 20 in my case.
        // This is also limited to the max value of an integer
        while (fibNumbers.length < value) {
            // Create a new array for the next number in the sequence
            int[] newFibNumbers = new int[fibNumbers.length + 1];
            // Copy the cotents from your original array to this new array
            System.arraycopy(fibNumbers, 0, newFibNumbers, 0, fibNumbers.length);
            // Calculate the last element which is equal to the sum of the previous two elements
            newFibNumbers[newFibNumbers.length - 1] = newFibNumbers[newFibNumbers.length - 2] + newFibNumbers[newFibNumbers.length - 3];
                      fibNumbers = newFibNumbers;
        }
return fibNumbers;
    }


}
