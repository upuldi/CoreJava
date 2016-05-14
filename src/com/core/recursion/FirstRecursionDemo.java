package com.core.recursion;

/**
 * Created by udoluweera on 5/14/16.
 */
public class FirstRecursionDemo {

    public static void main(String[] args) {

        simplestRecursionMethod(10);
    }

    private static void simplestRecursionMethod(int i) {
        System.out.println("i is : " + i);

        /* Termination condition is always required to stp[ the recursion */
        if (i>0) {
            simplestRecursionMethod(--i);
        }
    }

}
