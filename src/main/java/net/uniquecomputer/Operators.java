package net.uniquecomputer;

public class Operators {

    public static void main(String[] args) {

        // Arithmetic Operators
        // Assignment Operators
        // Comparison Operators
        // Logical Operators
        // Bitwise Operators


/*
        // Arithmetic Operators

        // + Addition Adds together two values x + y

            int firstValue = 10 , secoundValue = 20;
            System.out.println(firstValue + secoundValue);

        // - Subtraction Subtracts one value from another x - y

        int Subone = 50 , SubTwo = 25;
        System.out.println(Subone - SubTwo);

        // * Multiplication Multiplies two values x * y

        System.out.println(firstValue * secoundValue);

        // / Division Divides one value by another x / y

        int DivOne = 95 , DivTwo = 4;
        System.out.println(DivOne / DivTwo);

        // % Modulus Returns the division remainder x % y

        int ModulusOne = 555 , ModulusTwo = 6;
        System.out.println(ModulusOne % ModulusTwo);

        // ++ Increment Increases the value of a variable by 1 ++x or x++
        // -- Decrement Decreases the value of a variable by 1 --x or x--

        int PreValue = 50;

        // post-Increment ++

        System.out.println(PreValue++);
        System.out.println(PreValue);

        // ++ Pre-Increment
        System.out.println(++PreValue);
        System.out.println(PreValue);

        // Post-Decrement --
        System.out.println(PreValue--);
        System.out.println(PreValue);

        // --Pre-Decrement
        System.out.println(--PreValue);
        System.out.println(PreValue);
*/

        // Java Assignment Operators

        // = x = 5 x = 5
        // += x += 3 x = x + 3
        // -= x -= 3 x = x - 3
        // *= x *= 3 x = x * 3
        // /= x /= 3 x = x / 3
        // %= x %= 3 x = x % 3
        // &= x &= 3 x = x & 3      & (bitwise and)
        // |= x |= 3 x = x | 3      | (bitwise OR)
        // ^= x ^= 3 x = x ^ 3      ^ (bitwise XOR)
        // >>= x >>= 3 x = x >> 3   Signed Right Shift Operator (>>)
        // <<= x <<= 3 x = x << 3  Left shift operator (<<) -

        int a, b ,c ,d = 12;

        a = b = c = d;

        System.out.println("A " + a + " B " + b + " C " + c + " D " + d);

        int CakePrice = 150;
        CakePrice = CakePrice +5;
        CakePrice += 5;
        System.out.println("Cake Price With GST :" + CakePrice);



        // Java Comparison Operators

        // == Equal to                      x == y
        // != Not equal        (! =)             x != y
        // > Greater than                   x > y
        // < Less than                      x < y
        // >= Greater than or equal to  (> =)    x >= y
        // <= Less than or equal to     (< =)    x <= y

            int AliMarks = 65;
            int JonMarks = 55;
            int Sagar = 75;
         //   System.out.println( JonMarks <= AliMarks );


        // Java Logical Operators

        // &&  Logical and Returns true if both statements are true          x < 5 &&  x < 10
        // || Logical or return true if one of the statement is true        x < 5 || x < 4
        // ! Logical not reverse the result, returns false if the result is true       !(x < 5 && x < 10)

          //  System.out.println("Sagar Is Perfect  " + (Sagar > AliMarks || AliMarks > JonMarks));



        // Bitwise Operators            // Bitwise Working
        //    &, | , ~ , << , >> , ^

        //1  = True     0 = False

    /**
     * a = 0011 3
     * b = 0001 1
     * --------
     *
     * a&b = 0001 1
     *
     * a|b = 0011 3
     *
     *  a^b = 0010 2    // XOR Only One Value Can Be True
     *
     *  -a = 1100 12*/

    System.out.println(3 ^ 1);



    }

}
