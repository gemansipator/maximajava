package site.javadev.lesson_07.additional_task;

import java.util.Scanner;

/**Дано натуральное число N. Вычислите сумму его цифр.
 * При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется)
 **/
public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(sumOfDigits(number));

    }

    private static int sumOfDigits(int number) {

        if (number == 0) {
            return 0;
        }

        int lastDigit = number % 10; // Последняя цифра
        int remainingNumber = number / 10; // Оставшаяся часть числа
        return lastDigit + sumOfDigits(remainingNumber); // Рекурсивный вызов для оставшейся части числа и
        // суммирование последней цифры
    }

}
