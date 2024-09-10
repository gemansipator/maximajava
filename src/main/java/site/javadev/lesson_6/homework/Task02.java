package site.javadev.lesson_6.homework;

import java.util.Scanner;

/**Ввести 5 строк с консоли, найти самую короткую и самую длинную строки.
 * Вывести найденные строки и их длину.*/
public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] arr = new String[5];

        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        String shortString = null;
        String longString = null;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.next();

        }
        for (String s : arr) {
            if (s.length() < minValue) {
                minValue = s.length();
                shortString = s;

            } else if (s.length() > maxValue) {
                maxValue = s.length();
                longString = s;

            }
        }
        System.out.println("Самая короткая строка: " + shortString+ "\nДлина строки: " + minValue);
        System.out.println("Самая длинная строка: " + longString+ "\nДлина строки: " + maxValue);

    }
}
