package inno.lab4.task41;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("src/main/java/inno/task41/text.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        File file1 = new File("src/main/java/inno/task41/new_text.txt");
        FileWriter fileWriter = new FileWriter(file1, true);

        String string;
        int currentLength = length;
        while ((string = bufferedReader.readLine()) != null){
            String[] words = string.split(" ");
            for (String w : words){
                if ((currentLength - w.length()) >= 0){
                    if ((currentLength - w.length()) == 0){
                        fileWriter.append(w);
                        currentLength -= w.length();
                    } else {
                        fileWriter.append(w).append(" ");
                        currentLength -= w.length() + 1;
                    }
                    fileWriter.flush();
                } else {
                    fileWriter.append("\n").append(w).append(" ");
                    currentLength = length - w.length() - 1;
                    fileWriter.flush();
                }
            }
        }
    }
}
