package site.javadev.lesson_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**1. Создай список строк.
 2. Считай с клавиатуры 5 строк и добавь в список.
 3. Используя цикл, найди самую длинную строку в списке.
 4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.*/
public class Task02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        // Считываем 5 строк с клавиатуры
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите строку: ");
            list.add(sc.nextLine());
        }

        int maxLength = Integer.MIN_VALUE;
        ArrayList<String> longestStrings = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > maxLength) {
                maxLength = list.get(i).length();
                longestStrings.clear();  // очищаем список, так как нашли новую максимальную длину
                longestStrings.add(list.get(i)); // добавляем текущую строку
            } else if (list.get(i).length() == maxLength) {
                longestStrings.add(list.get(i));  // добавляем строку с такой же максимальной длиной
            }

        }
        
        System.out.println("Вывод всех самых длинных строк: ");
        for (int i = 0; i < longestStrings.size(); i++) {
            System.out.println(longestStrings.get(i));
        }


    }
}
