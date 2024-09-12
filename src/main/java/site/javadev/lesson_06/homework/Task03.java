package site.javadev.lesson_06.homework;

import java.util.Scanner;

/**1. Создать массив на 10 строк.
 2. Ввести с клавиатуры 8 строк и сохранить их в массив.
 3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке.
 Каждый элемент - с новой строки.*/
public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] str = new String[10];
        for (int i = 0; i < 8; i++) {
            str[i] = scanner.next();
        }
        for (int i = 9; i >= 0 ; i--) {
            System.out.println(str[i]);
        }
    }
}
