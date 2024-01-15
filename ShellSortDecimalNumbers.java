package com.mycompany.shellsortdecimalnumbers;


import java.util.Scanner;

public class ShellSortDecimalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] userInputs = new double[10];

        for (int i = 0; i < 10; i++) {
            userInputs[i] = getValidInput(scanner, i);
        }

        shellSort(userInputs);

        System.out.println("\nSorted Inputs:");
        for (double value : userInputs) {
            System.out.println(value);
        }

        System.out.print("\nDo you want to run again? (yes/no): ");
        String runAgain = scanner.next().toLowerCase();

        if (runAgain.equals("yes")) {
            main(args);
        } else if (runAgain.equals("no")) {
            System.out.println("Exiting program.");
        } else {
            System.out.println("Invalid input! Please enter 'yes' or 'no'.");
            main(args);
        }
    }

    private static double getValidInput(Scanner scanner, int index) {
        try {
            System.out.print("Enter number " + (index + 1) + ": ");
            double inputValue = scanner.nextDouble();

            // Ensure at least two decimal places
            if (String.valueOf(inputValue).contains(".") && String.valueOf(inputValue).split("\\.")[1].length() < 2) {
                throw new IllegalArgumentException("Number must have at least two decimal places.");
            }

            return inputValue;
        } catch (Exception e) {
            scanner.nextLine(); // Consume the invalid input
            System.out.println("Invalid input! " + e.getMessage());
            return getValidInput(scanner, index);
        }
    }

    private static void shellSort(double[] array) {
        int n = array.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                double temp = array[i];
                int j = i;

                while (j >= gap && array[j - gap] > temp) {
                    array[j] = array[j - gap];
                    j -= gap;
                }

                array[j] = temp;
            }
        }
    }
}
