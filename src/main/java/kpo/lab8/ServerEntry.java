package kpo.lab8;

import java.io.IOException;

/**
 * Класс точка входа для серверной части
 */
public class ServerEntry {

    public static void main(String[] args) throws IOException {
        new Server().run();
    }
}
