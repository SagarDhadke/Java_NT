package net.uniquecomputer;

public class Animal {
    public static void main(String[] args) {

        System.out.println("Hello Animal");

        // What is variable
        // why we are variable in java
        // variable declaration and Initialization
        // How to print variable
        // Variable syntax
        // Concatenation of variable
        // Addition of variable
        // write multiple variable on one line


        // variable is a placeholder
        // we can't repeat variable in a class
        // variable must be CAPITAL CASE

        // "int" is a datatype "integer"
        // you can use also "_" and "$" symbol for declare int variable
        // you can't use number in the first of variable name

        int value = 140;

        int secoundvalue; // Declaration
        secoundvalue = 200; // Intialization
        int _thirdvalue = 300;
        int $fourthvalue = 400;



        System.out.println(value);
        System.out.println(_thirdvalue);
        System.out.println($fourthvalue);


        // Concatenation of variable
        System.out.println(value +" " + secoundvalue);
        System.out.println("Your Result is: " + _thirdvalue);
        System.out.println("Your Result is: " + "149");


        int firstvalue = 50 , Secondvalue = 10;
        System.out.println("Sum is :" + (firstvalue + Secondvalue));
        System.out.println("Sum is :" + (firstvalue - Secondvalue));
        System.out.println("Sum is :" + (firstvalue * Secondvalue));
        System.out.println("Sum is :" + (firstvalue / Secondvalue));


    }
}
