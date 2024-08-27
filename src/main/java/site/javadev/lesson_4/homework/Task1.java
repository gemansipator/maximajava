package site.javadev.lesson_4.homework;

import java.util.Arrays;
import java.util.Scanner;

/**1
 Ввести с клавиатуры два числа m и n.
 Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

 Пример: m=2, n=4
 8888
 8888*/
public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число m: ");
        int m = scanner.nextInt();
        System.out.println("Введите число n: ");
        int n = scanner.nextInt();

        int[][] arr = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = j + 1;
                arr[i][j] = 8;
            }
            System.out.println(Arrays.toString(arr[i]));
        }

    }

}