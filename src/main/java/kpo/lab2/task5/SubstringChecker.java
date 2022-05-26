package kpo.lab2.task5;

public class SubstringChecker {

    public String checkSubstring(String string){
        if (string.contains("00") || string.contains("aa")){
            return "yes";
        }
        return "no";
    }
}
