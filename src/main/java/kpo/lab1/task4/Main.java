package kpo.lab1.task4;

public class Main {

    public static void main(String[] args) {

        int[] arguments = new int[args.length];

        for (int i = 0; i < arguments.length; i++){
            arguments[i] = Integer.parseInt(args[i]);
        }

        Number number = new Number();
        int sum = number.sum(arguments);
        int mult = number.mult(arguments);

        System.out.println("Сумма чисел: " + sum + "\nПроизведение чисел: " + mult);
    }
}
