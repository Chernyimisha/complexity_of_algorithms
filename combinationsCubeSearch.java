package complexity_of_algorithms;

import java.util.Scanner;

public class combinationsCubeSearch {
    public static void main(String[] args) {

//        1. Необходимо написать алгоритм поиска всех доступных комбинаций
//        (посчитать количество) для количества кубиков K с количеством граней N.
//        2. У вас есть 2 варианта на выбор – количество кубиков может быть строго
//        ограничено (4 кубика, например), либо их количество будет
//        динамическим. Выбор за вами.
//        3. Если вы реализуете простой вариант, обращает внимание, что данное
//        решение имеет сложность O(n4
//        ), но если количество кубиков сделать
//        переменной, то она трансформируется в O(nk
//        ), что будет представлять
//        собой экспоненциальную сложность. Для второго решения очевидно, что
//        его сложность O(nk) с самого начала.

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество кубиков K: ");
        int k = sc.nextInt();
        System.out.print("Введите количество граней N: ");
        int n = sc.nextInt();

        getCombinationsCubeSearch(k, n);

    }

    private static void getCombinationsCubeSearch(int k, int n) {
        int result = 0;

    }
}
