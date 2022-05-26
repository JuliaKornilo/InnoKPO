package kpo.lab3.task2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String path1 = "src/main/java/kpo/lab3/task2/Test.java";
        publicToPrivate(path1);
    }

    public static String publicToPrivate(String path1){
        String path2 = "src/main/java/kpo/lab3/task2/Test1.java";
        File f = new File(path1);
        File f1 = new File(path2);
        FileWriter fw = null;
        FileReader fr;
        try{
            fr = new FileReader(f);
            fw = new FileWriter(f1);
            int b;
            String tmp = "";
            //Cчитываем слово, записываем в tmp, если слово "public" - меняем на "private"
            while ((b = fr.read()) !=-1){
                if((char) b == ' '){
                    if (tmp.equals("public"))
                        fw.write("private ");
                    else
                        fw.write(tmp + " ");
                    tmp = "";
                }else if ((char) b == '\n'){
                    fw.write(tmp + '\n');
                    tmp = "";
                } else
                    tmp += (char) b;
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally{
            try{
                if (fw != null){
                    fw.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        return path2;
    }
}
