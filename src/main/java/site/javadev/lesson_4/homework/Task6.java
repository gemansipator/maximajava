package site.javadev.lesson_4.homework;

import java.util.Scanner;

/**Ввести с клавиатуры строку name.
 Ввести с клавиатуры дату рождения (три числа): y, m, d.


 Вывести на экран текст:
 "Меня зовут name.
 Я родился d.m.y"


 Пример вывода:
 Меня зовут Вася.
 Я родился 15.2.1988*/
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите своё имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите число дня рождения: ");
        int y = scanner.nextInt();
        System.out.println("Введите месяц рождения: ");
        int m = scanner.nextInt();
        System.out.println("Введите год рождения: ");
        int d = scanner.nextInt();

        System.out.println("Меня зовут "+ name+".");
        System.out.println("Я родился "+y+"."+m+"."+d);



    }
}
