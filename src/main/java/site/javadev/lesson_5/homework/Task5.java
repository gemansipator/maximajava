package site.javadev.lesson_5.homework;

import java.util.Scanner;

/**1. Создать массив на 20 чисел.
 2. Ввести в него значения с клавиатуры.
 3. Создать два массива на 10 чисел каждый.
 4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
 5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.*/
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[20];
        int[] arr2 = new int[10];
        int[] arr3 = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i <= 9; i++) {
            arr2[i]= arr[i];
        }
        for (int i = 10; i < arr.length; i++) {
            int j = i -10;
            arr3[j] = arr[i];

        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }
}
