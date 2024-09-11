package site.javadev.lesson_06.homework;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/** 1. Считать 6 строк и заполнить ими массив strings.
 * 2. Удалить повторяющиеся строки из массива strings,
 *    заменив их на null (null должны быть не строками "null")
 */
public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = new String[6];

        // Считываем строки и заполняем массив
        for (int i = 0; i < str.length; i++) {
            str[i] = scanner.nextLine();
        }

        // Поиск и замена повторяющихся строк на null
        for (int i = 0; i < str.length; i++) {
            if (str[i] == null) {
                continue; // Пропускаем, если элемент уже null
            }
            for (int j = i + 1; j < str.length; j++) {
                if (Objects.equals(str[i], str[j])) {
                    str[j] = null; // Если строки совпадают, заменяем на null
                }
            }
        }

        // Выводим массив
        System.out.println(Arrays.toString(str));
    }
}
