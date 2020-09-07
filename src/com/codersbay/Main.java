package com.codersbay;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbs = new int[100];

        int count = 0;

        while (true) {

            System.out.print("Zahl eingeben: ");
            String in = sc.nextLine();

            if (in.charAt(0) == 'q') {
                break;
            } else {
                numbs[count] = Integer.parseInt(in);
                count++;
            }

        }

        // Bubblesort
        for (int i = numbs.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbs[j] > numbs[j + 1]) {
                    int temp = numbs[j + 1];
                    numbs[j + 1] = numbs[j];
                    numbs[j] = temp;
                }
            }
        }

        System.out.println("Das Maximum der Zahlen ist: " + numbs[numbs.length-1]);

    }
}

