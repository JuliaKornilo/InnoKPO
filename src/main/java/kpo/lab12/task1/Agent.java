package kpo.lab12.task1;

public class Agent extends Person {

    @Override
    public void update(Event event) {
        switch (event) {
            case Arrest: {
                break;
            }
            case Robbery: {
                System.out.println("Это полиция. Вы арестованы.");
                gang.notifyGang(Event.Arrest);
                break;
            }
        }
    }
}
