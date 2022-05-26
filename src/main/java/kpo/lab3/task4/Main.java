package kpo.lab3.task4;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        File f = new File("src/main/java/kpo/lab3/task4/text.txt");
        File f1 = new File("src/main/java/kpo/lab3/task4/new_text.txt");
        BufferedReader bf;
        FileWriter fw = null;
        String pattern = "test";

        //Создание экземпляра класса Pattern
        Pattern r = Pattern.compile(pattern);

        try{
            bf = new BufferedReader(new FileReader(f));
            fw = new FileWriter(f1);
            String tmp;
            //Пока в файле есть ненулевые строки выполняем поиск по шаблону
            while ((tmp = bf.readLine()) != null) {
                //Создание экземпляра класса Matcher
                Matcher m = r.matcher(tmp);
                if (m.find()){
                    fw.write(m.group());
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                assert fw != null;
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
