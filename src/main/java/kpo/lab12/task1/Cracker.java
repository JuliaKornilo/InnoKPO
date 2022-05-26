package kpo.lab12.task1;

public class Cracker extends Person {

    @Override
    public void update(Event event) {
        if (event == Event.Robbery) {
            System.out.println("Это взломщик. Я готов.");
        }
    }
}
