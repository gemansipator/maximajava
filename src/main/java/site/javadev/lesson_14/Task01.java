package site.javadev.lesson_14;

import java.util.HashMap;
import java.util.Map;

/**1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
 2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
 3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
 4. Вывести содержимое Map на экран.*/
public class Task01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Сергей");
        map.put("Петров", "Алексей");
        map.put("Сидоров", "Иван");
        map.put("Кузнецов", "Алексей");
        map.put("Смирнов", "Дмитрий");
        map.put("Иванов", "Николай");
        map.put("Кузнецова", "Мария");
        map.put("Петров", "Сергей");
        map.put("Васильева", "Анна");
        map.put("Сидорова", "Мария");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
