package site.javadev.lesson_3.homework;

import java.util.Scanner;

/**
 4 Написать программу, которая будет проверять число, которое мы подадим ей.
 Если число положительное, то увеличить его в два раза.
 Если число отрицательное, то прибавить единицу.
 Если введенное число равно нулю, необходимо вывести ноль.
 Вывести результат в консоль.*/
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        if(number > 0){
            System.out.println(number * 2);
        } else if (number < 0) {
            System.out.println(number + 1);
        }else {
            System.out.println(number);
        }
    }
}
