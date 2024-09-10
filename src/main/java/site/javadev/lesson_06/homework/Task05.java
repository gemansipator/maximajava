package site.javadev.lesson_06.homework;

import java.util.Scanner;

/**1. Считать 6 строк и заполнить ими массив strings.
 2. Удалить повторяющиеся строки из массива strings,
 заменив их на null (null должны быть не строками "null")*/
public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] str  = new String[6];
        for (int i = 0; i < 6; i++) {
            str[i] = scanner.next();

        }
        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < 6; j++) {
                if (str[i].equals(str[j])) {
                    str[j] = "null";
                }
            }
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(str[i]);
        }
    }

}
