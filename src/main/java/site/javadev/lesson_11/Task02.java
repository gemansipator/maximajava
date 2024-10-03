package site.javadev.lesson_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**1. Создай список строк.
 2. Добавь в него 5 строк с клавиатуры.
 3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
 4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.
 */
public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List <String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextLine());
        }

        for (int i = 0; i < 13; i++) {
            String copy = list.getLast();
            list.remove(list.size()-1);
            list.add(0, copy);
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}
