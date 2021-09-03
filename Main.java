package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter k: ");
            int k = scanner.nextInt();

            System.out.println("Enter x[-1, 1): ");
            double x = scanner.nextDouble();
            if (x < -1 || x >= 1) {
                throw new Exception("X should be in [-1, 1)");
            }

            double esp = Math.pow(10, -k);
            double actVal = calculateActualValue(x);
            double calculatedVal = calculateTailorVal(esp, x);

            System.out.println("Actual value: " + formattedVal(actVal));
            System.out.println("Calculated value: " + formattedVal(calculatedVal));
        } catch (Exception ex) {
            System.out.println("Error while rading value: " + ex);
        }
    }
        static double calculateActualValue ( double x){
            return Math.log(1-x);
        }
        static double calculateTailorVal(double esp, double x) {
            double elem = 100;
            double calculatedVal = 0;
            int n = 1;
            while (Math.abs(elem) >= Math.abs(esp)) {
                elem = -(Math.pow(x, n) / n);
                calculatedVal += elem;
                n++;

            }
            return calculatedVal;
        }

        private static String formattedVal (double val){
        return String.format("%.3f", val);
        }

}



	// write your code here


