package site.javadev.lesson_11;

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

        // Запрашиваем 10 строк у пользователя
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextLine());
        }

        // Инициализируем переменные для хранения самой длинной и самой короткой строки
        String minValueString = list.get(0);
        String maxValueString = list.get(0);
        int minIndex = 0, maxIndex = 0;

        // Ищем самую короткую и самую длинную строку
        for (int i = 0; i < 10; i++) {
            String currentString = list.get(i);
            // Проверяем, является ли текущая строка короче
            if (currentString.length() < minValueString.length()) {
                minValueString = currentString;
                minIndex = i;  // Обновляем индекс
            }
            // Проверяем, является ли текущая строка длиннее
            if (currentString.length() > maxValueString.length()) {
                maxValueString = currentString;
                maxIndex = i;  // Обновляем индекс
            }
        }

        // Сравниваем индексы самой короткой и самой длинной строки
        if (minIndex < maxIndex) {
            System.out.println(minValueString); // Выводим самую короткую строку, если она была раньше
        } else {
            System.out.println(maxValueString); // Выводим самую длинную строку, если она была раньше
        }

        sc.close(); // Закрываем сканер
    }
}
