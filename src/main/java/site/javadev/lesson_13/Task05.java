package site.javadev.lesson_13;

import java.util.ArrayList;
import java.util.Scanner;

/**
 1. Введи с клавиатуры 10 слов в список строк.
 2. Определить, является ли список упорядоченным по возрастанию длины строки.
 3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
 */
public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listOfLines = new ArrayList<>();
        int indexOfDisorder = -1;  // Переменная для хранения индекса нарушающего элемента

        // Вводим 10 строк с клавиатуры
        for (int i = 0; i < 10; i++) {
            listOfLines.add(sc.next());
        }

        // Проверяем упорядоченность списка по длине строк
        for (int i = 0; i < listOfLines.size() - 1; i++) {
            if (listOfLines.get(i).length() > listOfLines.get(i + 1).length()) {
                indexOfDisorder = i + 1;  // Запоминаем индекс нарушающего элемента (следующий элемент)
                break;  // Прерываем цикл, как только нашли первое нарушение
            }
        }

        // Если нарушений не найдено
        if (indexOfDisorder == -1) {
            System.out.println("Список упорядочен по возрастанию длины строк");
        } else {
            System.out.println("Нарушение на индексе: " + indexOfDisorder);
        }

        sc.close();
    }
}
