package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo10 {

    public static void main(String[] args) {

        System.out.println("Welcome to V Cube Vegetable Market !!!");

        double fruPrice = 0;
        double vegPrice = 0;

        Scanner sc = new Scanner(System.in);

        String yn;

        do {

            System.out.println("\nEnter the category (vegetables / fruits): ");
            String category = sc.next();

            switch (category.toLowerCase()) {

            // ================= VEGETABLES =================
            case "vegetables" -> {

                String vyn;

                do {

                    System.out.println("Enter a vegetable item:");
                    String item = sc.next();

                    switch (item.toLowerCase()) {

                    case "tmt" -> {
                        System.out.println("The tomato per kg is 50 rs");
                        double tmtPrice = 50.0;
                        vegPrice = vegPrice + tmtPrice;
                    }

                    case "potato" -> {
                        System.out.println("The potato per kg is 40 rs");
                        double potatoPrice = 40.0;
                        vegPrice = vegPrice + potatoPrice;
                    }

                    case "onion" -> {
                        System.out.println("The onion per kg is 35 rs");
                        double onionPrice = 35.0;
                        vegPrice = vegPrice + onionPrice;
                    }

                    case "carrot" -> {
                        System.out.println("The carrot per kg is 60 rs");
                        double carrotPrice = 60.0;
                        vegPrice = vegPrice + carrotPrice;
                    }

                    case "brinjal" -> {
                        System.out.println("The brinjal per kg is 45 rs");
                        double brinjalPrice = 45.0;
                        vegPrice = vegPrice + brinjalPrice;
                    }

                    case "cabbage" -> {
                        System.out.println("The cabbage per kg is 30 rs");
                        double cabbagePrice = 30.0;
                        vegPrice = vegPrice + cabbagePrice;
                    }

                    default -> {
                        System.out.println("Entered vegetable item is not available");
                    }
                    }

                    System.out.println(
                            "Do you want to continue with Vegetables? Click Y or N:"
                    );

                    vyn = sc.next();

                } while (vyn.equalsIgnoreCase("y"));

                System.out.println("Exit from the Vegetables!!");
                System.out.println("Total Vegetable price is: " + vegPrice);
            }

            // ================= FRUITS =================
            case "fruits" -> {

                String fyn;

                do {

                    System.out.println("Enter fruit name:");
                    String item = sc.next();

                    switch (item.toLowerCase()) {

                    case "orn" -> {
                        System.out.println("Orange per kg price is 120 rs");
                        double ornPrice = 120;
                        fruPrice = fruPrice + ornPrice;
                    }

                    case "mango" -> {
                        System.out.println("Mango per kg price is 100 rs");
                        double mangoPrice = 100;
                        fruPrice = fruPrice + mangoPrice;
                    }

                    case "apple" -> {
                        System.out.println("Apple per kg price is 180 rs");
                        double applePrice = 180;
                        fruPrice = fruPrice + applePrice;
                    }

                    case "banana" -> {
                        System.out.println("Banana per kg price is 60 rs");
                        double bananaPrice = 60;
                        fruPrice = fruPrice + bananaPrice;
                    }

                    case "grapes" -> {
                        System.out.println("Grapes per kg price is 90 rs");
                        double grapesPrice = 90;
                        fruPrice = fruPrice + grapesPrice;
                    }

                    case "papaya" -> {
                        System.out.println("Papaya per kg price is 70 rs");
                        double papayaPrice = 70;
                        fruPrice = fruPrice + papayaPrice;
                    }

                    default -> {
                        System.out.println("Entered fruit is not available");
                    }
                    }

                    System.out.println(
                            "Do you want to continue with fruits? Click Y or N:"
                    );

                    fyn = sc.next();

                } while (fyn.equalsIgnoreCase("y"));

                System.out.println("Exit from fruits");
                System.out.println("Total fruits price is: " + fruPrice);
            }

            default -> {
                System.out.println(
                        "Entered category is not available right now!!"
                );
            }
            }

            
            System.out.println(
                    "\nDo you want to continue with categories? Click Y or N:"
            );

            yn = sc.next();

        } while (yn.equalsIgnoreCase("y"));

        System.out.println("\n==============================");
        System.out.println("Total Vegetable Price : " + vegPrice);
        System.out.println("Total Fruit Price     : " + fruPrice);
        System.out.println("------------------------------");
        System.out.println("Total Price           : " + (vegPrice + fruPrice));
        System.out.println("==============================");

        sc.close();
    }
}