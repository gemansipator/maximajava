package site.javadev.lesson_03;

import java.util.Scanner;

/**
 * Написать программу, которая, в зависимости от того числа, которое мы ей подадим (год),
 * будет определять количество дней в году. Результат вывести на экран в следующем виде:
 * количество дней в этом году: x
 * , где
 * х - 366 для високосного года,
 * х - 365 для обычного года.
 * <p>
 * Подсказка:
 * В високосном году - 366 дней, тогда как в обычном - 365.
 * 1) если год делится без остатка на 400 это високосный год;
 * 2) в оставшихся годах после этого, если год делится без остатка на 100, то это обычный год;
 * 3) в оставшихся годах после этого, если год делится без остатка на 4, то это високосный год;
 * 4) все оставшиеся года невисокосные.
 * Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
 * Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
 * Годы 2100, 2200 и 2300 - не високосные.
 */
public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = scanner.nextInt();

        if (year % 400 == 0) {
            // Год делится на 400 - високосный год
            System.out.println("Количество дней в этом году: 366 (високосный год)");
        } else if (year % 100 == 0) {
            // Год делится на 100, но не на 400 - обычный год
            System.out.println("Количество дней в этом году: 365 (обычный год)");
        } else if (year % 4 == 0) {
            // Год делится на 4, но не на 100 - високосный год
            System.out.println("Количество дней в этом году: 366 (високосный год)");
        } else {
            // Все остальные случаи - обычный год
            System.out.println("Количество дней в этом году: 365 (обычный год)");
        }
    }
}