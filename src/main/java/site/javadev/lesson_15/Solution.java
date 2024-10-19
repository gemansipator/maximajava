package site.javadev.lesson_15;

/**Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
 Удалить из множества все числа больше 10.


 Требования:
 •    Программа не должна выводить текст на экран.
 •    Программа не должна считывать значения с клавиатуры.
 •    Класс Solution должен содержать только три метода.
 •    Метод createSet() должен создавать и возвращать множество Set состоящих из 20 различных чисел.
 •    Метод removeAllNumbersGreaterThan10() должен удалять из множества все числа больше 10.*/
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код

        Set<Integer> set = new HashSet<Integer>();
        Collections.addAll(set, 1, 2, 3, 40, 5, 6, 7, 8, 9, 10, 11, 12, 13, 111, 15, 16, 17, 18, 19, 20);
        return set;
    }


    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> sset) {
        Iterator<Integer> iterator = sset.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number > 10) {
                iterator.remove();
            }
        }

        return sset;
    }
    public static void main(String[] args) {

    }


}
