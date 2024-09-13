package site.javadev.lesson_07;

import java.util.Scanner;

/**Напишите метод, который бы возвращал в консоль:


 true, если число больше 5
 и false, если число меньше 5*/
public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(checkNumber(sc.nextInt()));
    }

    private static boolean checkNumber(int sc) {
        return sc >= 5;
    }
}
