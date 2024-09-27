package site.javadev.Lesson_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**1. Создай список строк.
 2. Добавь в него 10 строчек с клавиатуры.
 3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
 Если таких строк несколько, то должны быть учтены самые первые из них.
 4. Выведи на экран строку из п.3. Должна быть выведена одна строка.*/
public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(sc.nextLine());
        }

        // Инициализируем переменные для хранения самой длинной и самой короткой строки
        String minValueString = list.get(0);
        String maxValueString = list.get(0);

        for (int i = 0; i < 10; i++) {
            if (list.get(i).length() < minValueString.length()) {
                minValueString = list.get(i);
            }
            if (list.get(i).length() > maxValueString.length()) {
                maxValueString = list.get(i);
            }

        }

        // Сравниваем индексы самой короткой и самой длинной строки
        if (list.indexOf(minValueString) < list.indexOf(maxValueString)) {
            System.out.println(minValueString); // Выводим самую короткую строку, если она была раньше
        } else {
            System.out.println(maxValueString); // Выводим самую длинную строку, если она была раньше
        }


        sc.close();
    }
}
