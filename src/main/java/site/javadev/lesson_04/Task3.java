package site.javadev.lesson_04;

import java.util.Scanner;

/** 3 Ввести с клавиатуры три числа, вывести на экран среднее из них.
 Т.е. не самое большое и не самое маленькое.
 Если все числа равны, вывести любое из них.*/
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int number2 = scanner.nextInt();
        System.out.println("Введите третье число: ");
        int number3 = scanner.nextInt();

        if (number1 == number2 && number2 == number3) {
            // Все три числа равны
            System.out.println("Все числа равны. Вы ввели: " + number1);
        } else if ((number1 >= number2 && number1 <= number3) || (number1 <= number2 && number1 >= number3)) {
            // number1 - среднее
            System.out.println("Среднее по значению: " + number1);
        } else if ((number2 >= number1 && number2 <= number3) || (number2 <= number1 && number2 >= number3)) {
            // number2 - среднее
            System.out.println("Среднее по значению: " + number2);
        } else {
            // number3 - среднее
            System.out.println("Среднее по значению: " + number3);
        }

        scanner.close();
    }
}
