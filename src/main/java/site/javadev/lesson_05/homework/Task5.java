package site.javadev.lesson_05.homework;

import java.util.Scanner;

/**1. Создать массив на 20 чисел.
 2. Ввести в него значения с клавиатуры.
 3. Создать два массива на 10 чисел каждый.
 4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
 5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.*/
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[20];
        int[] firstHalfNumbers = new int[10];
        int[] secondHalfNumbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i <= 9; i++) {
            firstHalfNumbers[i]= numbers[i];
        }
        for (int i = 10; i < numbers.length; i++) {
            int j = i -10;
            System.out.println(secondHalfNumbers[j] = numbers[i]);

        }
    }
}
