package kpo.lab11.task2;

import java.util.Scanner;

public class DialogManager {
//    Класс ждет команд от пользователя и совершает соответствующие действия
    Language language;

    public DialogManager(Language language) {
        this.language = language;
    }

    public void startDialog() {
        Scanner scanner = new Scanner(System.in);
        Language language = new Language();
        System.out.println("Что хотите выполнить?\n" +
                "1. Выбор языка\n" +
                "2. Ввод кода\n" +
                "3. Вывести таблицу лексем\n" +
                "4. Вывести триады\n" +
                "5. Вывести объектный код\n" +
                "0. Выход");
        int exe = scanner.nextInt();
        Compiler compiler = null;
        if (exe == 1)
            compiler = language.createCompiler(scanner.nextLine());
        else if (exe == 2)
            compiler.loadCode();
        //.........................
    }
}
