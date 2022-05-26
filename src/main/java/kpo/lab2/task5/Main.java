package kpo.lab2.task5;

import org.junit.jupiter.api.Test;

public class Main {

    SubstringChecker checker = new SubstringChecker();

    @Test
    public void yesAnswerTestWithAa(){
        assert checker.checkSubstring("aggtertaabdg").equals("yes");
    }

    @Test
    public void yesAnswerTestWithZeros(){
        assert checker.checkSubstring("aggtert00bdg").equals("yes");
    }

    @Test
    public void noAnswerTest(){
        assert checker.checkSubstring("abcdefg").equals("no");
    }
}
