package com.example.lab1;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;
import java.io.File;

public class Lab2_9 {

        public static void main(String[] args) throws FileNotFoundException {
            File file = new File("C:\\Users\\user\\IdeaProjects\\Lab1\\src\\com\\example\\lab1\\MatrText");
            Scanner scanner = new Scanner(file);


            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[][] matr = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matr[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Inputted matrix: ");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(matr[i][j] + " ");
                }
                System.out.println();
            }


            int seriaLen=0;
            int minSeriaLen=20000;
            int numb=0;
            int tMax=0;
            for (int i = 0; i < n; i++) {
                tMax=0;
                seriaLen=0;
                for (int j=0; j< m-1; j++) {

                    if (matr[i][j] == matr[i][j + 1]) {
                        seriaLen++;
                    }
                    else if (seriaLen!=0 && seriaLen+1>tMax) {
                        tMax=seriaLen+1;
                        seriaLen=0;
                    }
                }

                if(minSeriaLen>tMax && tMax!=0) {
                    minSeriaLen = tMax;
                    numb=i+1;
                }
            }

            System.out.println("Minimum series length: " + minSeriaLen);
            System.out.println("In the line number: " + numb);
        }


    }

