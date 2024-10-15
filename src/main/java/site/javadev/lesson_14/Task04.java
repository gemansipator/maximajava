package site.javadev.lesson_14;

import java.util.HashMap;
import java.util.Map;

/**Создать коллекцию Map<String, String> (реализация HashMap), занести туда 10 пар строк:
 арбуз - ягода,
 банан - трава,
 вишня - ягода,
 груша - фрукт,
 дыня - овощ,
 ежевика - куст,
 жень-шень - корень,
 земляника - ягода,
 ирис - цветок,
 картофель - клубень.
 Вывести содержимое коллекции на экран, каждый элемент с новой строки.

 Пример вывода (тут показана только одна строка):
 картофель - клубень*/
public class Task04 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("дыня", "овощ");
        map.put("ежевика", "куст");
        map.put("жень-шень", "корень");
        map.put("земляника", "ягода");
        map.put("ирис", "цветок");
        map.put("картофель", "клубень");

        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " - " + value);
        }

    }
}
