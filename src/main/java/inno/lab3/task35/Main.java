package inno.lab3.task35;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        String path = scanner.nextLine();
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String string;
        boolean flag = false;
        while ((string = bufferedReader.readLine()) != null){
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