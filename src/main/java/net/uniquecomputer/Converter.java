package net.uniquecomputer;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {

        // CONVERT Temperature celsius to fahrenheit

            float celsius = 86;

            celsius = celsius *9;
            System.out.println(celsius);

            celsius = celsius /5;
            System.out.println(celsius);

            celsius = celsius +32;
            System.out.println("C=> " + celsius + "°F"+ " Fahrenheit");



        // Convert temperature fahrenheit to celsius

        float fahrenheit = 52;

        fahrenheit = fahrenheit -32;
        System.out.println(fahrenheit);

        fahrenheit = fahrenheit *5;
        System.out.println(fahrenheit);

        fahrenheit = fahrenheit /9;

        System.out.println(32 + "F=> " + fahrenheit + "°C" + " Celsius");


        //Kelvin to Fahrenheit Temperature Converter

        double kelvin = 86;

        kelvin = kelvin -273.15;
        System.out.println(kelvin);

        kelvin = kelvin *9;
        System.out.println(kelvin);

        kelvin = kelvin /5;
        System.out.println(kelvin);

        System.out.println(32 + "°F" + kelvin);


        // Own Practice Code with input fields
        // CONVERT Temperature celsius to fahrenheit

        Scanner scanner = new Scanner(System.in);
        float CelsiusInput = scanner.nextFloat();
        System.out.println(CelsiusInput);

        CelsiusInput = CelsiusInput *9;
        System.out.println(CelsiusInput);

        CelsiusInput = CelsiusInput /5;
        System.out.println(CelsiusInput);

        CelsiusInput = CelsiusInput +32;
        System.out.println(5 + "C=> " + CelsiusInput + "°F"+ " Fahrenheit");

        


    }
}
