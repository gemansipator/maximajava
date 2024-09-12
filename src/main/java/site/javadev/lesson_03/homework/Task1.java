package site.javadev.lesson_03.homework;

import java.util.Scanner;

/**1 Написать программу, чтобы она:
 - выводил на экран строку "Число меньше 5", если число, которое мы ей подадим меньше 5,
 - выводил строку "Число больше 5", если число, которое мы ей подадим больше 5,
 - выводил строку "Число равно 5", если число, которое мы ей подадим равен 5.  */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 0 до 10: ");
        int value = scanner.nextInt();

        if (value < 5) {
            System.out.println("Число "+value+" меньше 5");
        } else if (value > 5) {
            System.out.println("Число "+value+" больше 5");
        }else {
            System.out.println("Число "+value+" равно 5");
        }
    }
}
