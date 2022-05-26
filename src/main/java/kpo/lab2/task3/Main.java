package kpo.lab2.task3;

import kpo.lab1.task3.Authorization;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class Main {

    Authorization authorization = new Authorization("myPass123");

    @Test
    public void correctPassTest(){
        assumeTrue(authorization.checkPassword("myPass123"));
    }

    @Test void incorrectPassTest(){
        assumeTrue(!authorization.checkPassword("myPass1234"));
    }
}
