

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.StringTokenizer;

public class Task17_09 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("TextEx");
        Scanner scanner = new Scanner(file);
        StringBuffer bufLine=new StringBuffer();
        while (scanner.hasNextLine()) {
            bufLine.append(" ");
            bufLine.append(scanner.nextLine());
        }
        String line=bufLine.toString();
        System.out.println(line);
        StringTokenizer str= new StringTokenizer(line);
        String word;
        double numb;
        double sum=0;
        while(str.hasMoreTokens()) {
        word=str.nextToken();
        try {
            numb = Double.parseDouble(word);
            sum+=numb;
        }
            catch(NumberFormatException ex)
            {};

        }
        System.out.println(sum);



    }
}