package site.javadev.lesson_07;

import java.util.Scanner;

/**Написать метод, который бы возвращал из 2 чисел меньшее число. Например, из двух чисел 7 и 3 метод
 * должен вывести в консоль 3.*/
public class Task03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int number01 = s.nextInt();
        System.out.println("Введите второе число: ");
        int number02 = s1.nextInt();

        System.out.println("Минимальное значение: "+ minimumNumber(number01, number02));

        s.close();
        s.close();
    }

    private static int minimumNumber( int number01, int number02) {
        return Math.min(number01, number02);
    }
}
