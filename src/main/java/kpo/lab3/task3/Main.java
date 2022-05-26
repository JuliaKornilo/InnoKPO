package kpo.lab3.task3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        File file = new File("src/main/java/kpo/lab3/task3/test.csv");
        int counter = 0;
        //Создаем обьект для чтения из файла
        try (FileReader reader = new FileReader(file)) {
            int symbol;
            //Читаем файл по символьно
            while ((symbol = reader.read()) != -1) {
                //Считаем количество элементов
                if (symbol == 44) {
                    counter++;
                }
                else if (symbol == 13) {
                    counter++;
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int[][] numbersArray = new int[counter][counter];
        //Создаем обьект для чтения из файла
        try (FileReader reader = new FileReader(file)) {
            StringBuilder number = new StringBuilder();
            int rowCounter = 0, columnCounter = 0;
            int symbol;
            //Читаем файл по символьно
            while ((symbol = reader.read()) != -1) {

                if (symbol == 44) {
                    //Если запятая, вставляем число и переходим на столбик вперед
                    numbersArray[rowCounter][columnCounter] = Integer.parseInt(number.toString());
                    columnCounter++;
                    number = new StringBuilder();
                    continue;
                } else if (symbol == 13) {
                    //Если перевод каретки, вставляем число и переходим на строку вперед, обнуляя счетчик столбцов
                    numbersArray[rowCounter][columnCounter] = Integer.parseInt(number.toString());
                    columnCounter = 0;
                    rowCounter++;
                    number = new StringBuilder();
                    continue;
                } else if (symbol == 10) {
                    continue;
                }
                number.append((char) symbol);
            }
            numbersArray[rowCounter][columnCounter] = Integer.parseInt(number.toString());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        //Вывод исходной матрицы
        for (int[] numbers: numbersArray) {
            for (int number: numbers) {
                System.out.format("%-4d", number);
            }
            System.out.println();
        }
        //Транспонирование матрицы
        for(int i = 0; i < numbersArray.length; i++) {
            for(int j = 0; j < numbersArray[i].length; j++) {
                if (i > j) {
                    continue;
                }
                int num = numbersArray[i][j];
                numbersArray[i][j] = numbersArray[j][i];
                numbersArray[j][i] = num;
            }
        }
        System.out.println();
        //Вывод транспонированной матрицы
        for (int[] numbers: numbersArray) {
            for (int number: numbers) {
                System.out.format("%-4d", number);
            }
            System.out.println();
        }
    }
}
