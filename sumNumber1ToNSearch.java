package complexity_of_algorithms;

import java.util.Scanner;

public class sumNumber1ToNSearch {
    public static void main(String[] args) {
//        Необходимо написать алгоритм, считающий сумму всех чисел
//        от 1 до N. Согласно свойствам линейной сложности,
//        количество итераций цикла будет линейно изменяться
//        относительно изменения размера N.

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите натуральное число N: ");
        int n = sc.nextInt();
        final long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        System.out.printf("Сумма всех чисел от 1 до %d равна %d\n", n, getSum(n));
        final long endTime = System.currentTimeMillis();
        System.out.println(endTime);
        System.out.println("\nTotal execution time: " + (endTime - startTime));
    }

    private static int getSum(int num) {
        int result = 0;
        for (int i = 0; i < num; i++) {
            result = result + i;
        }
        return result;
    }


}
