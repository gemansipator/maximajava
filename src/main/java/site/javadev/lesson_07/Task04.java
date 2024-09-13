package site.javadev.lesson_07;

import java.util.Scanner;

/**
 * Написать метод, который будет принимать число и степень.
 * В этом методе нужно два раза вызвать ДРУГОЙ МЕТОД, который вернет число в заданной степени.
 * А затем сложить результаты двух вызовов и вывести в консоль.
 */
public class Task04 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        // Чтение числа и степени с клавиатуры
        System.out.println("Введите число:");
        int number = sc1.nextInt();
        System.out.println("Введите степень:");
        int power = sc1.nextInt();

        // Вызов метода numberPower, который дважды возведет число в степень и сложит результаты
        System.out.println("Число " + number + " , возведено в степень: " + power +
                "\nРезультат сложения двух вызовов: " + numberPower(number, power));

        sc1.close(); // Закрытие сканера
    }

    // Метод, который вызывает метод возведения в степень два раза и складывает результаты
    private static int numberPower(int number, int power) {
        return number(number, power) + number(number, power);
    }

    // Метод возведения числа в заданную степень
    private static int number(int number, int power) {
        int result = 1;  // Начальное значение для возведения в степень

        // Цикл для возведения числа в степень
        for (int i = 0; i < power; i++) {
            result *= number;  // Умножаем результат на number на каждой итерации
        }

        return result;
    }
}
