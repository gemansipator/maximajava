package site.javadev.lesson_4.homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 2 Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок
 со сторонами 10 и 10.


 Пример вывода на экран:
 8
 88
 888
 8888
 88888
 888888
 8888888
 88888888
 888888888
 8888888888*/
public class Task2 {
    public static void main(String[] args) {

        String a = "8";
        for (int i = 0; i < 10; i++) {

            System.out.println(a);

            a = a + 8;
        }

        /**Вариант решения с массивом: */
//        String[][] arr = new String[10][10];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (i >= j){
//                    arr[i][j] = "8";
//
//                }
//                if(arr[i][j] == null){
//                    arr[i][j] = " ";
//
//                }
//            }
//            System.out.println(Arrays.toString(arr[i]));
//        }

        //Вариант из интернета:
        // Используем внешний цикл для строк
        for (int i = 0; i < 10; i++) {
            // Внутренний цикл для вывода 8
            for (int j = 0; j <= i; j++) {
                System.out.print("8");
            }
            // Переход на следующую строку после завершения вывода символов 8
            System.out.println();
        }
    }
}
