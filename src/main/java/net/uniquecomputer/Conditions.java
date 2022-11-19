package net.uniquecomputer;

import javax.swing.*;
import java.nio.channels.Pipe;

public class Conditions {
    public static void main(String[] args) {

        String iStudy = "If (I Study) " +
                        "else then {I pass}";
        String goingSchool = "If You Sleep 9 o Clock" +
                                "then You wake up early in the morning";

        String javaCourseVideo = "If you watch this course  " +
                                    "than you understand this topic";
        // Match Example

        //Syntax
//            if (condition) {
//                // block of ode of be executed if the condition is true
//            } else {
//                // block of code to be executed if the condition is false
//            }

        // Basic Example

        int time = 12;

        if (time < 18) {
            System.out.println("Good Day ");
            System.out.println("Hava a good day");
        }
        else {
            System.out.println("Good Evening");
        }


        int aliMarks = 45;
        int johnMarks = 65;
        int abdulMarks = 92;

        if (aliMarks > johnMarks && aliMarks > abdulMarks){
            System.out.println("Ali ki First Position");
        } 
        else if (johnMarks > aliMarks && johnMarks > abdulMarks) {
            System.out.println("John ki first position");
            
        } else if (abdulMarks > johnMarks && abdulMarks > aliMarks) {
            System.out.println("Abdul ki first Position");
        }
        else {
            System.out.println("Result is Comming Soon" );
        }



        // Own Practice Set
        int Jay = 75;
        int Priya = 98;
        double Sagar = 98.1;
        int Gampu = 84;

        if (Jay > Priya && Jay > Sagar && Jay > Gampu){
            System.out.println("Jay is Winner");

        } else if (Priya > Jay && Priya > Sagar && Priya > Gampu) {
            System.out.println("Priya is Winner");

        } else if (Sagar > Jay && Sagar > Priya && Sagar > Gampu) {
            System.out.println("Sagar is Winner");

        } else if (Gampu > Jay && Gampu > Priya && Gampu > Sagar) {
            System.out.println("Gampu is Winner");

        }
        else {
            System.out.println("Result is coming Soon...");
        }

    }
}
