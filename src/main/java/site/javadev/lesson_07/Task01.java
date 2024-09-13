package site.javadev.lesson_07;

import java.util.Scanner;

/**Напишите метод, с помощью которого можно было бы возводить число, переданное в сигнатуру метода, в куб.*/
public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        System.out.println("Число "+"в кубе. Результат: " + cubeOfNumbers(sc.nextInt()));
    }

    private static int cubeOfNumbers(int number) {
        return number * number * number;
    }
}
