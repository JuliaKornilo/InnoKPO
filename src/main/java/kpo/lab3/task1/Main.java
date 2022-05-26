package kpo.lab3.task1;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        File file = new File("src/main/java/kpo/lab3/task1/text.txt");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        assert fileReader != null;
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String string = "";
        while (true){
            try {
                if ((string = bufferedReader.readLine()) == null) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            String[] words = string.split(" ");
            for (int i = 0; i < words.length - 1; i++){
                if (words[i].endsWith(String.valueOf(words[i + 1].charAt(0)))){
                    System.out.println(words[i] + " " + words[i + 1]);
                }
            }
        }
    }
}
