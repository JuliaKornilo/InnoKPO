package kpo.lab7.task2;

import java.io.IOException;

public class Task7 {

    public static void main(String[] args) throws IOException {
        TestsJSONValidator jsonValidator = new TestsJSONValidator();
        jsonValidator.validate("src/main/java/kpo/lab7/task2/Tests.json");
    }
}
