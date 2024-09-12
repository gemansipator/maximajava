package site.javadev.lesson_04.homework;


import java.util.Scanner;

/**1
 Ввести с клавиатуры два числа m и n.
 Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

 Пример: m=2, n=4
 8888
 8888*/
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число m: ");
        int m = scanner.nextInt();
        System.out.println("Введите число n: ");
        int n = scanner.nextInt();


        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(8);
            }
            System.out.println();
        }

    }

}