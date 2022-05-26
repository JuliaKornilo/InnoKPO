package kpo.lab12.task2;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, IOException, TransformerException {
        Expert expert = new Expert();
        expert.convertTxtToXml("src/main/java/kpo/lab12/task2/article.txt", "src/main/java/kpo/lab12/task2/article.xml");
    }
}
