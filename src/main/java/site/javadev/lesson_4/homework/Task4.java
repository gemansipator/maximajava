package site.javadev.lesson_4.homework;

import java.util.Scanner;


/** 4 Вводить с клавиатуры числа.
 Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
 -1 должно учитываться в сумме.*/
public class Task4 {
    public static void main(String[] args) {

        int number;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа. Чтобы закончить, введите -1. Это число тоже будет в сумме: ");

        do {
            number = scanner.nextInt();
            sum = sum + number;
        } while (number != -1);

        System.out.println(sum);

        scanner.close();
    }
}

