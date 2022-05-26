package kpo.lab8;

import java.io.IOException;

/**
 * Класс точка входа для клиентской части
 */
public class ClientEntry {

    public static void main(String[] args) throws IOException {
        new Client().run();
    }
}
