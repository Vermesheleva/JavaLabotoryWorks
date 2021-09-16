package com.example.lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.lang.Comparable;
import java.util.Scanner;


public class Lab2_15 {





    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("C:\\Users\\user\\IdeaProjects\\Lab1\\src\\com\\example\\lab1\\Matrix3"));


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
        int [] temp;
        for (int i=0;  i<n; i++){
            for(int k=1+1; k<n; k++) {

                if (matr[i][0] > matr[k][0]) {
                    temp = matr[i];
                    matr[i] = matr[k];
                    matr[k] = temp;
                }

            }
        }
        System.out.println("Changed matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
