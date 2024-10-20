package site.javadev.lesson_15;

/**Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
 Удалить из множества все числа больше 10.


 Требования:
 •    Программа не должна выводить текст на экран.
 •    Программа не должна считывать значения с клавиатуры.
 •    Класс Solution должен содержать только три метода.
 •    Метод createSet() должен создавать и возвращать множество Set состоящих из 20 различных чисел.
 •    Метод removeAllNumbersGreaterThan10() должен удалять из множества все числа больше 10.*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код

        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= 20; i++) {
            set.add(i);
        }
        return set;
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        set.removeIf(number -> number > 10);
    }
    public static void main(String[] args) {
        // Создание множества
        Set<Integer> numbers = createSet();

        // Удаление чисел больше 10
        removeAllNumbersGreaterThan10(numbers);

    }


}
