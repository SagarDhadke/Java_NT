package net.uniquecomputer.Methods;

import java.sql.SQLOutput;

public class Method {
    public static void main(String[] args) {

//        additionTwoValue();
//
//        int subtractionResult = subtractTwoValue();
//        System.out.println("Subtraction of Two Numbers => " + subtractionResult);

//        multiplicationTwoValues(2 ,5);

        float divionResult = divisionTwoValues(11 , 2);
        System.out.println("Division of two Values is => " + divionResult);
    }


   static void additionTwoValue(){
        int firstvalue = 12;
        int secoundvalue = 32;
        int result = firstvalue + secoundvalue;
        System.out.println("Addition of Two Numbers => " + result);
    }

    static int subtractTwoValue(){
        int firstValue = 20;
        int secoundValue = 10;
        int result = firstValue - secoundValue;
        return result;
    }

    // This is argument in Java
    static void multiplicationTwoValues(int firstValue , int secundValue){
        int result = firstValue * secundValue;
        System.out.println("Multiplication of Two Values => " + result);
    }

    static float divisionTwoValues(float firstValue , float secondValue){
        float result = firstValue / secondValue;
            return  result;
    }
}
