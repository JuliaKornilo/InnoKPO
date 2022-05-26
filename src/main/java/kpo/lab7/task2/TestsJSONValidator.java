package kpo.lab7.task2;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.security.jgss.GSSUtil;
import org.json.JSONArray;

import java.io.*;
import java.sql.Date;

public class TestsJSONValidator {

    Integer currentId;
    boolean isGood;

    public void validate(String jsonFile) throws IOException {
        //Считываем json файл в java обьект
        ObjectMapper mapper = new ObjectMapper();
        FileReader json = new FileReader(jsonFile);
        Test[] tests = mapper.readValue(json, Test[].class);
        for (Test test: tests) {
            //Производим все проверки
            currentId = test.getIdPatient();
            isGood = true;
            checkIdPatien(test.getIdPatient());
            checkDate(test.getDate());
            checkIdLaboratory(test.getLaboratoryId());
            checkPrecision(test.getPrecision());
            checkResult(test.getResult());
            checkType(test.getType());
            if (isGood) {
                System.out.println("Тест пациента " + currentId + " успешно завершен");
            }
        }
    }
    //Проверка идентификатор пациента
    private void checkIdPatien(Integer value) {
        if (value <= 0) {
            System.out.println("Неправильный id");
            isGood = false;
        }
    }
    // Проверка даты теста
    private void checkDate(String value) {
        try {
            Date.valueOf(value);
        } catch (Exception e) {
            System.out.println("Неверная дата для id " + currentId);
            isGood = false;
        }
    }
    // Проверка типа теста
    private void checkType(String value) {
        if (!(value.equals("lgM") || value.equals("lgG"))) {
            System.out.println("Неверный тип для id " + currentId);
            isGood = false;
        }
    }
    // Проверка точности теста
    private void checkPrecision(String value) {
        if (!(value.equals("quantitative") || value.equals("qualitative"))) {
            System.out.println("Неверная точность для id " + currentId);
            isGood = false;
        }
    }
    // Проверка идентификатора лаборатории
    private void checkIdLaboratory(Integer value) {
        if (value <= 0) {
            System.out.println("Неверный идентификатор лаборатории для id " + currentId);
            isGood = false;
        }
    }
    // Проверка результата теста
    private void checkResult(String value) {
        if (!(value.equals("positive") || value.equals("negative"))) {
            System.out.println("Неверный результат для id " + currentId);
            isGood = false;
        }
    }
}
