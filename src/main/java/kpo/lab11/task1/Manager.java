package kpo.lab11.task1;

import java.io.File;

public class Manager {

    String language;
    Compiler compiler;

    public void setLanguage(String language){
        this.language = language;
    }

    public void createCompiler(){
        switch (language){
            case "Java":{
                compiler = new JavaCompiler();
                break;
            }
            case "JavaScript":{
                compiler = new JavaScriptCompiler();
                break;
            }
            case "Pascal":{
                compiler = new PascalCompiler();
                break;
            }
        }
    }

    public void compile(File file){
        compiler.compile(file);
    }
}
