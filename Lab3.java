package com.company;

import java.io.FileNotFoundException;
import java.util.*;
import java.util.SortedSet;
import java.io.File;


public class Lab3 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("TextEx");
        Scanner scanner = new Scanner(file);
        StringBuilder bufLine = new StringBuilder();
        while (scanner.hasNextLine()) {
            bufLine.append(" ");
            bufLine.append(scanner.nextLine());
        }
        Set<Character> charAr = new TreeSet<Character>();
        for(int i=0; i<bufLine.length(); i++){
            char c=bufLine.charAt(i);
            if (Character.isLetter(c))
                charAr.add(c);
        }



        System.out.print(charAr.toString());
    }

}