package kpo.lab1.task4;

/**
 * Класс для проведения вычислений суммы и произведения аргументов
 */
public class Number {

    /**
     *
     * @param numbers - параметр переменной длины - числа для суммирования
     * @return
     */
    public int sum(int...numbers){
        int result = 0;

        for (int n : numbers){
            result += n;
        }

        return result;
    }

    /**
     *
     * @param numbers - параметр переменной длины - числа для произведения
     * @return
     */
    public int mult(int...numbers){
        int result = 1;

        for(int n : numbers){
            result *= n;
        }

        return result;
    }
}
