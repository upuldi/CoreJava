package com.core.contructors.constructorInheritence;

/**
 * Created by udoluweera on 5/9/16.
 */
public class SubClass extends SuperClass {
    public SubClass() {
        super(12); //Here the super class doesnt has a default constructor.
        System.out.println("Always the first line should be a call to the super constructor.");
    }

    public SubClass(int someVariable) {
        super(someVariable);
    }

    public SubClass(int someVariable,String anotherValue) {
        this(someVariable); // Calling the constructor of the same class, but again it should be the first line of the constructor.
    }

}
