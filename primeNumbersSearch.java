package complexity_of_algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class primeNumbersSearch {

//    Написать алгоритм поиска простых чисел (делятся только на себя и
//    на 1) в диапазоне от 1 до N. В алгоритме будет использоваться
//    вложенный for, что явно говорит о квадратичной сложности, на этом
//    стоит акцентировать внимание
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите натуральное число N: ");
        int n = sc.nextInt();

        final long startTime = System.currentTimeMillis();
        printArray(getPrimeNumberSearchEngine(n));
        final long endTime = System.currentTimeMillis();
        System.out.println("\nTotal execution time: " + (endTime - startTime));

    }

    private static void printArray(ArrayList<Integer> list) {
        for (int i: list) {
            System.out.print(i + " ");
        }
    }

    private static ArrayList<Integer> getPrimeNumberSearchEngine(int num) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 1; i < num; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag == true) result.add(i);
        }
        return result;
    }
}
