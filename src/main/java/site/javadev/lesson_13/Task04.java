package site.javadev.lesson_13;

import java.util.ArrayList;
import java.util.Scanner;

/**
 1. Введи с клавиатуры 10 слов в список строк.
 2. Метод doubleValues должен удваивать слова по принципу:
 "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
 3. Выведи результат на экран, каждое значение с новой строки.*/
public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(sc.next());
        }

        //Удвоение слов
        ArrayList<String> result = doubleValues(list);

        // Вывод результата
        for (String s : result) {
            System.out.println(s);
        }

        sc.close();
    }

    private static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> result = new ArrayList<>();

        // Проходим пок аждому слову и добавляем его
        for (String s : list) {
            result.add(s);
            result.add(s);
        }


        return result;
    }

}
