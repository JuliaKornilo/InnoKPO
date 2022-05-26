package inno.lab5.task53;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Однострочный комментарий
public class Test {
    //Проверка

    /*
    Много
    Строчный
    Комментарий
     */
    public static void test() throws IOException {

        /**До
         * ку
         * мен
         * та
         * ция
         */
        File file = new File("src/main/java/inno/task31/text.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().toLowerCase().replaceAll("ё", "е").replaceAll("й", "и");
        int counter = 0;
        Pattern pattern = Pattern.compile(word, Pattern.CASE_INSENSITIVE);

        String string;
        while ((string = bufferedReader.readLine()) != null){
            String[] words = string.split(" ");
            for (String w : words){
                w = w.replaceAll("ё", "е").replaceAll("й", "и");
                Matcher matcher = pattern.matcher(w);
                if (matcher.find())
                    counter++;
            }
        }
        System.out.println(counter);
    }
}
