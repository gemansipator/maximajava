package site.javadev.lesson_14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.*/
public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<>();

        // Инициализация данных
        map.put(1, "Ивановы");
        map.put(2, "Петровы");
        map.put(3, "Сидоровы");
        map.put(4, "Кузнецовы");
        map.put(5, "Смирновы");

        // Ввод номера дома
        System.out.println("Введите номер дома: ");
        int houseNumber = sc.nextInt();

        // Поиск семьи по номеру дома
        if (map.containsKey(houseNumber)) {
            String family = map.get(houseNumber);
            System.out.println("В доме номер " + houseNumber + " живет семья " + family);
        } else {
            System.out.println("Семья с таким номером дома не найдена.");
        }
    }
}
