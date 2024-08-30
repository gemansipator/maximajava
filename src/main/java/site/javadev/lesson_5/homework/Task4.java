package site.javadev.lesson_5.homework;

import java.util.Scanner;

/**4
 1. Создать массив на 10 чисел.
 2. Ввести с клавиатуры 10 чисел и записать их в массив.
 3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.*/
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 9; i < array.length; i--) {
            if(i >= 0){
                System.out.println(array[i]);
            }
        }



        scanner.close();
    }
}
