package site.javadev.lesson_14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
 Используй коллекции.*/
public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        map.put("January", 1); // Январь
        map.put("February", 2); // Февраль
        map.put("March", 3); // Март
        map.put("April", 4); // Апрель
        map.put("May", 5); // Май
        map.put("June", 6); // Июнь
        map.put("July", 7); // Июль
        map.put("August", 8); // Август
        map.put("September", 9); // Сентябрь
        map.put("October", 10); // Октябрь
        map.put("November", 11); // Ноябрь
        map.put("December", 12); // Декабрь
        System.out.println("Введите название месяца: ");
        String key = sc.nextLine();

        // Проверка наличия ключа в map
        if(map.containsKey(key)) {
            int value = map.get(key);
            //Форматированный вывод
            System.out.printf("%s is the %d month", key, value);
        } else {
            System.out.println("Такого месяца не существует. Проверьте, в верном ли регистре написан месяц. Например January. ");
        }

    }
}
