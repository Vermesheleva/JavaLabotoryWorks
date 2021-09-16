package com.example.lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("C:\\Users\\user\\IdeaProjects\\Lab1\\src\\com\\example\\lab1\\Matrix2"));


        int n = scanner.nextInt();
        int[][] matr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Inputted matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }
        boolean isSymmetric = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matr[i][j] != matr[j][i]){
                    isSymmetric = false;
                    break;
                }
            }
        }
        if (isSymmetric){
            System.out.println("Matrix is symmetric");
        }
        else System.out.println("Matrix isn't symmetric");

        int max = 0;
        int ind1 = 0;
        int ind2 = 0;
        for (int i = 0; i < n; i++) {

                if (matr[i][i] > max){
                    max=matr[i][i];
                    ind1 = i;
                    ind2 = i;
                }
            if (matr[i][n-1] > max){
                max=matr[i][n-1];
                ind1 = i;
                ind2 = n-1;
            }
        }
        System.out.println("Max element: " + max);
        matr[ind1][ind2] = matr[n/2][n/2];
        matr[n/2][n/2] = max;

        System.out.println("Changed matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }

    }

}
