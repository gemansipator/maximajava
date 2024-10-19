package site.javadev.lesson_14;

import java.util.HashMap;
import java.util.Map;


/**Есть коллекция Map<String, Object> (реализация HashMap), туда занесли 10 различных пар объектов.
 Вывести содержимое коллекции на экран, каждый элемент с новой строки.

 Пример вывода (тут показана только одна строка):
 Sim - 5*/
public class Task05 {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("Sim", 5);
        map.put("Tom", "Hello");
        map.put("Jerry", 3.14);
        map.put("Anna", true);
        map.put("John", 42);
        map.put("Alice", "World");
        map.put("Bob", 99.99);
        map.put("Charlie", false);
        map.put("Dave", 'A');
        map.put("Eve", 123456789L);

        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
