package com.example.mystudycodes25;

public class Scratch {

    //Estudos Java 2025

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //Arrays
        int[] anArray;
        anArray = new int[5];
        anArray[0] = 100;
        anArray[1] = 200; anArray[2] = 300;
        anArray[3] = 400; anArray[4] = 500;

        System.out.println("Elemento no index 0: " + anArray[0]);
        System.out.println("Elemento no index 1: " + anArray[1]);
        System.out.println("Elemento no index 2: " + anArray[2]);
        System.out.println("Elemento no index 3: " + anArray[3]);
        System.out.println("Elemento no index 4: " + anArray[4]);

        int[] anArray2 = {
                100, 200, 300,
                400, 500, 600,
                700, 800, 900, 1000
        };

        System.out.println("Elemento no index 9 no anArray2: " + anArray2[9]);
    }
}


