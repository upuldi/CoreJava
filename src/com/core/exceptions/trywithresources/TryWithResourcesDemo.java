package com.core.exceptions.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by udoluweera on 5/14/16.
 */
public class TryWithResourcesDemo {

    public static void main(String[] args) throws IOException {


        /**
         * If you are defining a try block without catch (or finally) the method you define that
         * method has to throw exceptions which might occur in the try block.
         */


        /**
         * Try Can be defined with out catch but with finally;
         * So before java 7 evey try block should be either followd by catch or finally
         *
         */
        try {
            //code with checked exceptions

        } finally {

        }


        /**
         * Now Try can be defined without catch or finally.
         */
        try (BufferedReader br = new BufferedReader(new FileReader(""))) {
            //Do Somtehing Here
        }


    }

}
