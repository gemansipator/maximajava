package site.javadev.lesson_11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
 * Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
 * Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
 * Порядок объявления списков очень важен.
 * 1.1 Создай метод printList
 * 2. Метод printList должен выводить на экран все элементы списка с новой строки.
 * 3. Используя метод printList выведи эти три списка на экран.
 * Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
 * */
public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num; //переменная для хранения вводимого числа

        ArrayList<Integer> divByThree = new ArrayList<>(); // кратное трем
        ArrayList<Integer> divByTwo = new ArrayList<>();   //кратное двум
        ArrayList<Integer> others = new ArrayList<>(); //остальные

        for (int i = 0; i < 20; i++) {
            num = sc.nextInt();
            if (num % 3 == 0) {
                divByThree.add(num);
            }
            if (num % 2 == 0) {
                divByTwo.add(num);
            }
            if(num % 3 != 0 && num % 2 != 0) {
                others.add(num);
            }
        }
        printList(divByThree);
        printList(divByTwo);
        printList(others);

    }

    private static void printList(ArrayList<Integer> list) {
        for (int num : list) {
            System.out.println(num);
        }

    }
}
