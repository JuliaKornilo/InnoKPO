package kpo.lab12.task4;

public class Man {

    String name;

    public Man(String name) {
        this.name = name;
    }

    public void update(String type) {
        System.out.println("Привет, я " + name + ". У меня есть " + type);
    }
}
