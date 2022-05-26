package kpo.lab12.task3;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        ShapesRandomizer.chooseRandomClass(Objects.requireNonNull(ShapesRandomizer.chooseRandomSize()));
    }
}
