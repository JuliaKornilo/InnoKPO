package inno.lab7.task71;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        File file = new File("src/main/java/inno/task71/text.txt");
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
            changePlace(words);
            append(words);
        }
    }

    /**
     * Производит запись в новый файл построчно
     * @param words
     */
    public static void append(String[] words){
        File file1 = new File("src/main/java/inno/task71/new_text.txt");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file1, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String w : words){
            try {
                assert fileWriter != null;
                fileWriter.append(w).append(" ");
                fileWriter.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            assert fileWriter != null;
            fileWriter.append("\n");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Меняет местами первый символ и последний
     * @param words
     */
    public static void changePlace(String[] words){
        String temp = words[0];
        words[0] = words[words.length - 1];
        words[words.length - 1] = temp;
    }
}
