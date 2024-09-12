package site.javadev.lesson_05.homework;

import java.util.Scanner;

/**4
 1. Создать массив на 10 чисел.
 2. Ввести с клавиатуры 10 чисел и записать их в массив.
 3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.*/
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите десять чисел диапазона int: ");
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = array.length -1; i >= 0; i--) {
                System.out.println(array[i]);
        }



        scanner.close();
    }
}
