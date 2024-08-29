package site.javadev.lesson_4.homework;


/**1
 Ввести с клавиатуры два числа m и n.
 Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

 Пример: m=2, n=4
 8888
 8888*/
public class Task1 {
    public static void main(String[] args) {

        int m = 2;
        int n = 4;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(8);
            }
            System.out.println();
        }

    }

}