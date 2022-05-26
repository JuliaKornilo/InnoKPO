package kpo.lab2.task1;

import kpo.lab1.task3.Authorization;
import org.junit.jupiter.api.Test;

public class Main {
    Authorization authorization = new Authorization("myPass123");

    @Test
    public void correctPassTest(){
        assert authorization.checkPassword("myPass123");
    }

    @Test
    public void incorrectPassTest(){
        assert !authorization.checkPassword("myPass1234");
    }
}
