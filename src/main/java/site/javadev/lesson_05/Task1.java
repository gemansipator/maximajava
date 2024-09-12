package site.javadev.lesson_05;

import java.util.Scanner;

/**1. Создать массив на 10 строк.
 2. Ввести с клавиатуры 8 строк и сохранить их в массив. Для считывания строк используй у сканера
 метод nextLine()
 3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый
 элемент - с новой строки.*/
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] arr = new String[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextLine();
        }
        for (int i = arr.length -1; i >= 0 ; i--) {
                System.out.println(arr[i]);
        }
        scanner.close();

    }
}
