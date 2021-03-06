package kpo.lab4;

import java.sql.*;
import java.util.*;
/*Главный класс программы. Создаются экземпляры классов Connector, Statement, Request.
* Пользователь выбирает какое из 5 заданий выполнить.*/
public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connector connector = new Connector("jdbc:mysql://localhost/kpo", "root", "");
        Statement statement = connector.connection();
        Request request = new Request(statement);
        Scanner scan = new Scanner(System.in);
        System.out.println("Какое задание выполнить?(1-5)");
        int a = scan.nextInt();
        if (a == 1)
            request.workingTeacher("Friday", "114");
        else if (a == 2)
            request.notWorkingTeacher("Sunday");
        else if (a == 3)
            request.numOfLessons(9);
        else if (a == 4)
            request.numOfClassrooms(2);
        else if (a == 5)
            request.replaceTable("Sunday");
        else
            System.out.println("Неверное число");
    }
}


