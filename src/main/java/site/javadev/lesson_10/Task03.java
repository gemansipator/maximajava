package site.javadev.lesson_10;

import java.util.ArrayList;
import java.util.Scanner;

/**1. Создай список строк.
 2. Считай с клавиатуры 5 строк и добавь в список.
 3. Используя цикл, найди самую короткую строку в списке.
 4. Выведи найденную строку на экран.
 5. Если таких строк несколько, выведи каждую с новой строки.*/
public class Task03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        // Считываем 5 строк с клавиатуры
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите строку: ");
            list.add(sc.nextLine());
        }

        int minLength = Integer.MAX_VALUE;
        ArrayList<String> shortestStrings = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < minLength) {
                minLength = list.get(i).length();
                shortestStrings.clear();  // очищаем список, так как нашли новую максимальную длину
                shortestStrings.add(list.get(i)); // добавляем текущую строку
            } else if (list.get(i).length() == minLength) {
                shortestStrings.add(list.get(i));  // добавляем строку с такой же максимальной длиной
            }

        }
        
        System.out.println("Вывод всех самых коротких строк: ");
        for (String s : shortestStrings) {
            System.out.println(s);
        }


    }
}
