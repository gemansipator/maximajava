package site.javadev.lesson_07.additional_task;

import java.util.Scanner;

/**Даны два целых числа A и В (каждое в отдельной строке). Выведите все числа от A до B включительно,
 * в порядке возрастания, если A < B, или в порядке убывания в противном случае.*/
public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        System.out.println("Enter number");
        int b = sc.nextInt();

        numberPrint(a, b);

    }

    private static void numberPrint(int a, int b) {

        if(a == b){
            System.out.println(a);
            return;
        }
        System.out.println(a);


        if (a < b){
            try {
                Thread.sleep(100); // Задержка в 0.1 секунду Если 1000 то секунда
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            numberPrint(a + 1, b);
        }
        if(a > b){
            try {
                Thread.sleep(100); //Задержка в 0.1 секунду
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            numberPrint(a -1, b);
        }
    }
}
