package com.core.exceptions.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by udoluweera on 5/14/16.
 */
public class TryWithResourcesDemo {

    public static void main(String[] args) throws IOException {


        //Try Can be defined with out catch but with finally;
        /* So before java 7 evey try block should be either followd by catch or finally */
        try {

        } finally {

        }


        //Try with resources goes like this
        tryWithResource();


    }

    private static void tryWithResource() throws IOException {

        try (BufferedReader br =
                     new BufferedReader(new FileReader(""))) {
            //Do Somtehing Here
        }
    }
}
