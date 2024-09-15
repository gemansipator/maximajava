package site.javadev.lesson_07;

import java.util.Scanner;

/**Написать простой консольный калькулятор на Java.
 Метод int getInt() - должен считывать с консоли целое число и возвращать его
 Метод char getOperation() - должен считывать с консоли какое-то значение и возвращать символ с операцией
 (+, -, * или /)
 Метод int calc(int num1, int num2, char operation) - должен выполнять над числами num1 и num2
 арифметическую операцию, заданную operation.
 Метод main() - должен считывать 2 числа (с помощью getInt()), считать операцию (с помощью getOperation(),
 передать все методу calc() и вывести на экран результат.*/
public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");

        int num1 = getInt(sc);
        int num2 = getInt(sc);
        char operation = getOperation(sc);
        System.out.println(calc(num1, num2, operation));

        sc.close();

    }

    private static char getOperation(Scanner sc) {
        return sc.next().charAt(0);
    }

    private static int getInt(Scanner sc) {
        return sc.nextInt();
    }
    private static double calc(int num1, int num2, char operation) {
        return switch (operation) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Ошибка: деление на ноль!");
                    yield -1;
                }
                yield (double) num1 / num2;
            }
            default -> {
                System.out.println("Ошибка: неизвестная операция");
                yield -1;
            }
        };
    }
}

