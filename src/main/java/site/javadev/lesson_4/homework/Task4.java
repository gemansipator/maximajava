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

        //После написания программы, которая закоментирована, intellij idea поменяла цикл while на  do while
        do {
            number = scanner.nextInt();
            sum = sum + number;
        } while (number != -1);

//        while (true) {
//            number = scanner.nextInt();
//            sum = sum + number;
//            if (number == -1)
//            break;
//        }
        System.out.println(sum);

        scanner.close();
    }
}

//Вариант с фиксированным количеством чисел:
//public class Task4 {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите первое число: ");
//        int number1 = scanner.nextInt();
//        System.out.println("Введите второе число: ");
//        int number2 = scanner.nextInt();
//        System.out.println("Введите третье число: ");
//        int number3 = scanner.nextInt();
//
//        if (number1 == -1 || number2 == -1 || number3 == -1)
//        {
//
//            System.out.println(number1+number2+number3);
//
//        }else{
//            System.out.println("Вы ввели числа: "+number1+" "+number2+" "+number3);
//        }
//        scanner.close();
//    }
//}
