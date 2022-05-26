package kpo.lab2.task2;

import kpo.lab1.task4.Number;
import org.junit.jupiter.api.Test;

public class Main {

    Number number = new Number();

    @Test
    public void oneNumberTestSum(){
        assert number.sum(5) == 5;
    }

    @Test
    public void twoNumberTestSum(){
        assert number.sum(5, 6) == 11;
    }

    @Test
    public void threeNumberTestSum(){
        assert number.sum(5, 6, 7) == 18;
    }

    @Test
    public void oneNumberTestMult(){
        assert number.mult(5) == 5;
    }

    @Test
    public void twoNumberTestMult(){
        assert number.mult(5, 6) == 30;
    }

    @Test
    public void threeNumberTestMult(){
        assert number.mult(5, 6, 7) == 210;
    }
}
