package site.javadev.lesson_13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**Введи с клавиатуры 5 слов в список строк.
 * Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.*/
public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(sc.next());
        }
        list.remove(2);
        System.out.println(list.reversed());
        sc.close();
    }
}
