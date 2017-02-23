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
        fibonacciArray = new ArrayList<>();

    }

    public ArrayList<Integer> fibonacci(int value) {
        if (value == 0) {
            return fibonacciArray;
        } else if (value == 1) {
            fibonacciArray.add(0);
            return fibonacciArray;
        } else if (value == 2) {
            fibonacciArray.add(0);
            fibonacciArray.add(1);
            return fibonacciArray;
        } else {
            fibonacciArray.add(0);
            fibonacciArray.add(1);
            for (int i = 2; i < value; i++) {
                fibonacciArray.set(i, (fibonacciArray.get(i - 1) + fibonacciArray.get(i - 2)));
            }
            return fibonacciArray;
        }
    }
}
