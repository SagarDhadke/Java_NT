package net.uniquecomputer;

import java.util.Scanner;

public class SwitchC {
    public static void main(String[] args) {


    /*     switch (expression) {
             case x;
                    // code block
                    break;
               case y;
                    // code block
                    break;
               default;
                    // code block
         }
    */

//        int day = 2;
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Day not found");

                char quote = 'b';
                switch (quote){
                    case 'a':
                    System.out.println("Everything starts with a dream");
                    break;
                    case 'b':
                    System.out.println("Everything begins with a thought");
                    break;

                default:
                    System.out.println("Invalid Value...");
            }




            // Own Practice Code

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String  valueIn = input;
        switch (valueIn){
            case "a":
                System.out.println("Everything starts with a dream");
                break;
            case "b":
                System.out.println("Everything begins with a thought");
                break;

            default:
                System.out.println("Invalid Value...");
        }

    }

}

