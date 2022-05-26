package kpo.lab12.task1;

public class Boss extends Person {

    @Override
    public void update(Event event) {

        if (event == Event.Arrest) {
            System.out.println("Это Босс. Ограбление провалено.");
            gang.notifyGang(Event.Failed);
        }
    }

    public void beginRobbery() {

        System.out.println("Это Босс. Идем грабить банк.");
        gang.notifyGang(Event.Robbery);
    }
}
