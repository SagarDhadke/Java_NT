package net.uniquecomputer.Robot;

public class Robot {
    String name = "Jaddu Robot";
    int weight = 2;

    static void buyMlik(int litter){
        int milkPricePerLiter = 2;
        System.out.println("Grab Money");
        System.out.println("Leave Home");
        System.out.println("Turn Right");
        System.out.println("Walk 40 steps");
        System.out.println("Buy " + litter + " litters Milk from Milk Shop");
        System.out.println("Pay Bill and Came back Home");
        System.out.println("-----------------------------");
        System.out.println("Price Litter Milk Price = " + milkPricePerLiter + "$" +
                " So, Total Bill = " + litter *milkPricePerLiter + "$");
    }

    static int buyGrocery(int breadPacketQuantity, int eggsQuantity, int honeyJarQuantity){
        int totalBill;

        int breadPrice = 3;
        int eggPrice = 1;
        int honeyJarPrice = 4;
        System.out.println("Go to Grocery Store");
        System.out.println("Buy " + breadPacketQuantity + " Fresh Bread Packets & Check Expiry Date");
        System.out.println("Buy " + eggsQuantity + " eggs & Check Expiry Date");
        System.out.println("Buy " + honeyJarQuantity + " Honey Medium Jars Check Expiry Date");
        System.out.println("Pay Bill and Came back Home");

        int breadBil = breadPrice * breadPacketQuantity;
        int eggBill = eggPrice * breadPacketQuantity;
        int honeyBill = honeyJarPrice * honeyJarQuantity;

        System.out.println("Bread Bill is = " + breadBil);
        System.out.println("Eggs Bill is = " + eggBill);
        System.out.println("HoneyJar Bill is = " + honeyBill);

        System.out.println("-----------------------------");
        totalBill = breadBil + eggBill + honeyBill;
//        System.out.println(totalBill);


        return totalBill;
    }
}
