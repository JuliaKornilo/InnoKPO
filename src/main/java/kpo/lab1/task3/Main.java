package kpo.lab1.task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Authorization authorization = new Authorization("myPass123");
        String password = scanner.nextLine();
        if (authorization.checkPassword(password)){
            System.out.println("Пароль верный");
        } else {
            System.out.println("Пароль неверный");
        }
    }
}
