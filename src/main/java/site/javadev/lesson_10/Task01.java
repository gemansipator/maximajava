package site.javadev.lesson_10;

import java.util.ArrayList;

/**1. Создай список строк.
 2. Добавь в него 5 различных строк.
 3. Выведи его размер на экран.
 4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.*/
public class Task01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
