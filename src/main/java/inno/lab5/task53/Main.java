package inno.lab5.task53;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String path = scanner.nextLine();
        File file = new File(path);
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        assert fileReader != null;
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String string = "";
        boolean flag = false;
        while (true){
            try {
                if ((string = bufferedReader.readLine()) == null) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (string.matches(".*/{2}.*")){
                continue;
            } else if (string.matches(".*/\\*{1,2}.*")) {
                flag = true;
            }
            if (string.matches(".*\\*/")){
                flag = false;
                continue;
            }
            if (flag) {
                continue;
            }
            System.out.println(string);
        }
    }
}