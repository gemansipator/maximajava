package site.javadev.lesson_05;

import java.util.Scanner;

/**1. Создать массив на 10 строк.
 2. Создать массив на 10 чисел.
 3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
 4. В каждую ячейку массива чисел записать длину строки из массива строк,
 индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
 Для нахождения длины строки используй у конкретного слова вызов метода length()*/
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] str = new String[10];
        int [] arr = new int[10];
        for (int i = 0; i < str.length; i++) {
            System.out.println("Введите строку: ");
            str[i] = scanner.nextLine();
            arr[i] = (str[i].length());
            System.out.println("Длина строки, включая пробелы, равна: "+ arr[i] + " ");
        }
        scanner.close();
    }

}
