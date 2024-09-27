package site.javadev.Lesson_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**1. Создай список строк в методе main.
 2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
 3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.*/
public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(0, sc.nextLine());
        }
        for (String s : list) {
            System.out.println(s);
        }


    }
}
