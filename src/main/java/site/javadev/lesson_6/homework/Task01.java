package site.javadev.lesson_6.homework;

import java.util.Scanner;

/**Задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
 Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.


 Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
 Если в строке чётное число букв, строка удваивается, если нечётное - утраивается.
 Программа выводит слова на экран.

 */
public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводите строки, после ввода жмите Enter. \nКак закончите - введите " +
                "пустую строку: ");
        
        boolean flag = true;

        while (flag) {
            String input = scanner.nextLine();
            String upperCaseLetters = input.toUpperCase();

            if (upperCaseLetters.length() % 2 == 0) {
                upperCaseLetters = upperCaseLetters + upperCaseLetters;
                System.out.println( upperCaseLetters);
            }else {
                upperCaseLetters = upperCaseLetters + upperCaseLetters +upperCaseLetters;
                System.out.println(upperCaseLetters);

            }

            if (upperCaseLetters.isEmpty()) {
                System.out.println("Программа закончена");
                flag = false;
            }


        }
        
        

        scanner.close();
    }
}
