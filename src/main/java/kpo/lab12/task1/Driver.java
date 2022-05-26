package kpo.lab12.task1;

public class Driver extends Person {

    @Override
    public void update(Event event) {
        if (event == Event.Robbery) {
            System.out.println("Это водитель. Я готов.");
        }
    }
}
