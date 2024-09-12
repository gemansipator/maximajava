package site.javadev.lesson_05;

import java.util.Scanner;

/**1.1. Создай массив на 10 чисел
 1.2. Считай с консоли 10 чисел и заполни ими массив
 2. Найти максимальное число из элементов массива*/
public class Task2 {
    public static void main(String[] args) {
        int maxValue  = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }

        }
        scanner.close();
        System.out.println("Максимальное число в массиве: " + maxValue);



    }
}
