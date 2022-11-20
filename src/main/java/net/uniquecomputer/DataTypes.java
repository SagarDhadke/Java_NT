package net.uniquecomputer;

public class DataTypes {

    public static void main(String[] args) {


        // Primitive Data Types

        // Boolean => A boolean data type is declared with the boolean keyword and can only take the values true or false.

        boolean isWaterTasteless = true;
        boolean isNotTasteLess = false;

        System.out.println(isWaterTasteless);
        System.out.println(isNotTasteLess);

        // Char => Stores a single character/letter or ASCII values

        char myChar = 'A';
        System.out.println(myChar);


        //Byte => The byte data type can Store whole numbers from -128 to 127

       byte number = -128;
       System.out.println(number);

        //Short => The short data type can Store whole numbers from -32,768 to 32,767

        short myShort = 32767;
        System.out.println(myShort);

        //Integer
        //Int => The int data type can Store whole numbers from -2,147,483,648 to 2,147,483,647

       int myInt = 59999;
       System.out.println(myInt);

        //Long => The long data type can  Store whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        long myLong = 126L;
        long ToLong = 49L;
        System.out.println(myLong + " " + ToLong);
        System.out.println( "Long Addition: " + (myLong + ToLong));

        //Floating Point
        //Float => The float data type can Store fractional numbers from 3.4e-038 to 3.4e+038.

        float myFloat = 3.4e-038f;
        System.out.println(myFloat);

        //Double => The double type can Store fractional numbers from 1.7e-308 to 1.7e+308.

        double myDouble = 1.7e-308;
        System.out.println(myDouble);

        //Class, object, Interface, Array, String...
    }

}
