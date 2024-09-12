package site.javadev.lesson_06.homework;

import java.util.Scanner;

/**1. Создать массив на 10 строк.
 2. Создать массив на 10 чисел.
 3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
 4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки
 которой совпадает с текущим индексом из массива чисел.*/
public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] str = new String[10];
        int [] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            str[i] = scanner.next();
            numbers[i] = str[i].length();
        }
    }

}
