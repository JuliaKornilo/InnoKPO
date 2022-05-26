package inno.lab3.task32;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("src/main/java/inno/task32/text.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int sum = 0;

        String string;
        while ((string = bufferedReader.readLine()) != null){
            String[] words = string.split(" ");
            for (String w : words){
                if (w.matches("\\d+")){
                    sum += Integer.parseInt(w);
                }
            }
        }
        System.out.println(sum);
    }
}
