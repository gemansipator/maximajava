package site.javadev.lesson_3.homework;

import java.util.Scanner;

/** 2 Напиши программу. которая будет проверять попало ли целое число, которое мы
 ей подадим
 в интервал от 50 до 100 и сообщить результат на экран в следующем виде:
 "Число number не содержится в интервале." или "Число number содержится
 в интервале.", где number - число,
 которое мы ей подадим.*/
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        if(number >= 50 && number <= 100) {
            System.out.println("Число" + number + " содержится в интервале.");
        }else {
            System.out.println("Число" + number + " не содержится в интервале.");
        }
    }
}
