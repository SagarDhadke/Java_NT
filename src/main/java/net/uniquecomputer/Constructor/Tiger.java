package net.uniquecomputer.Constructor;

import javax.swing.plaf.IconUIResource;

public class Tiger {

    /**
     * constructor Use for Initialization of Object
     * Constructor looks like method but not a method
     * constructor name is smw as class name
     * method has return type Constructor don't
     * Method Syntax
     * How to call a constructor
     * constructor gets call when we create object of the class  e.g after writing
     * */

//    public Tiger(){
//        System.out.println("Default Constructor ");
//    }

    /**
     *      Constructor Rules
     * 1: Constructor name must be same ad
     * 2: Method don't have ny explicit return type
     * */

    /**
     *      Constructor Types
     * 1: No Argument Constructor (Default Constructor)
     * 2: Augmented-(Parameterized) Constructor
     * */


    // No Argument Constructor

    private int speed;
    public Tiger(){
        speed = 90;
        System.out.println("Tiger Speed => " + speed);
    }

    // Parameterized Constructor

    public Tiger(int firstValue , int secoundValue){
        int result = firstValue + secoundValue;
        System.out.println(result);

    }

}
