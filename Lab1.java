package com.example.lab1;

import java.util.Scanner;

    public class Lab1 {

        static double calculateActualValue ( double x){
            return Math.log(1-x);
        }
        static double calculateTailorVal(double acc, double x) {

            double calculatedVal = 0;
            int n = 1;
            double temp = 1;
            double elem = 100;
            while (Math.abs(elem) >= Math.abs(acc)) {
                temp = temp*x;
                elem = temp/n;
                calculatedVal += elem;
                n++;

            }
            return calculatedVal;
        }

        private static String formattedVal (double val){
            return String.format("%.3f", val);
        }

        public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("Enter accuracy: ");
                int k = scanner.nextInt();

                System.out.println("Enter x [-1, 1): ");
                double x = scanner.nextDouble();
                if (x < -1 || x >= 1) {
                    throw new Exception("X should be in [-1, 1)");
                }

                double acc = Math.pow(10, -(2*k+1));
                double actVal = calculateActualValue(x);
                double calculatedVal = calculateTailorVal(acc, x);

                System.out.println("Actual value: " + formattedVal(actVal));
                System.out.println("Calculated value: " + formattedVal(calculatedVal));
            } catch (Exception ex) {
                System.out.println("Error while reading value: " + ex);
            }
        }


    }

