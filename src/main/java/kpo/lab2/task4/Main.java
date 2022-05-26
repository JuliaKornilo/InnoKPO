package kpo.lab2.task4;

import org.junit.jupiter.api.Test;

public class Main {

    Number number = new Number();

    @Test
    public void subTestPositive(){
        assert number.subtract(5, 3) == 2;
    }

    @Test
    public void subTestNegative(){
        assert number.subtract(3, 5) == -2;
    }

    @Test
    public void subTestZero(){
        assert number.subtract(5, 5) == 0;
    }
}
