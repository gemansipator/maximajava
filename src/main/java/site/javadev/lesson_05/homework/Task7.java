package site.javadev.lesson_05.homework;

import java.util.Scanner;

/**
 * Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
 */
public class Task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[20];

        System.out.println("Заполните массив 20-ю числами в int диапазоне: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
