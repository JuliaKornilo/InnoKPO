package inno.lab5.task52;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        int n, m;
        for (int i = 0; i <= 100_000; i++){
            sb.append(i);
        }
        n = scanner.nextInt();
        m = scanner.nextInt();
        if (n > m)
            throw new IllegalArgumentException("левая граница должна быть меньше правой");
        System.out.println(sb.substring(n, m + 1));
    }
}
