package site.javadev.lesson_05.homework;

import java.util.Scanner;

/**
 * Создать массив на 20 чисел.
 * Заполнить его числами с клавиатуры.
 * Найти максимальное и минимальное числа в массиве.
 * Вывести на экран максимальное и минимальное числа через пробел.
 *
 */
public class Task6 {
    public static void main(String[] args) {

        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        Scanner scanner = new Scanner(System.in);

        int[] aar = new int[20];

        System.out.println("Заполните массив 20-ю числами в int диапазоне: ");
        for (int i = 0; i < aar.length; i++) {
            aar[i] = scanner.nextInt();
            if (aar[i] > maxValue) {
                maxValue = aar[i];
            }
            if (aar[i] < minValue) {
                minValue = aar[i];
            }
        }
        System.out.println(maxValue + " " + minValue);
    }
}
