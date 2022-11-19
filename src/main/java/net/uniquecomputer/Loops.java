package net.uniquecomputer;

import java.sql.Statement;

public class Loops {
    public static void main(String[] args) {
        // Loops    // a statement that can iterate itself
        // Types
        // for loop , while loop , do while loop


        // for loop Syntax
        // for (initialization ; condition ; update)
        //   {
        //        Statement
        //   }


        /*
        * while loop Syntax
        * initialization
        * while(condition)
        *
        *       statement
        *       update;
        * }*/

//    for (int name = 1 ; name <= 50 ; name ++)
//    {
//        System.out.println("Unique Computer Pvt Ltd...");
//    }

//    int value;
//    for ( value = 1; value <= 10; value++)
//    {
//        System.out.println(value *2);
//    }


//        int value = 1;
//        while (value <=10)
//        {
//            System.out.println(value *2);
//            value++;
//        }


        // Entry Control Loop
//        int name =1;
//        while (name <=10)
//        {
//            System.out.println("In");
//            name++;
//        }

        /*
        * initialization
        * do {
        *     Statement;
        *     update;
        * }while (condition)*/

        // Exit Control Loop

        int name = 1;
        do {
            System.out.println(name);
            name++;
        }while (name <= 5);

        // Exit Point
        // Differences

    }
}
