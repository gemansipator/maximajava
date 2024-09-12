package site.javadev.lesson_03;

import java.util.Scanner;

/**3 Напиши программу, которая по номеру месяца должна определить время года
  (зима, весна, лето, осень) и вывести
  на экран.*/
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число месяца: ");
        int number = scanner.nextInt();

        switch (number){
            case 1:
                System.out.println("номер месяца "+number+". Январь. Зима.");
                break;
            case 2:
                System.out.println("номер месяца "+number+". Февраль. Зима.");
                break;
            case 3:
                System.out.println("номер месяца "+number+". Март. Весна.");
                break;
            case 4:
                System.out.println("номер месяца "+number+". Апрель. Весна.");
                break;
            case 5:
                System.out.println("номер месяца "+number+". Май. Весна.");
                break;
            case 6:
                System.out.println("номер месяца "+number+". Июнь. Лето.");
                break;
            case 7:
                System.out.println("номер месяца "+number+". Июль. Лето.");
                break;
            case 8:
                System.out.println("номер месяца "+number+". Август. Лето.");
                break;
            case 9:
                System.out.println("номер месяца "+number+". Сентябрь. Осень.");
                break;
            case 10:
                System.out.println("номер месяца "+number+". Октябрь. Осень.");
                break;
            case 11:
                System.out.println("номер месяца "+number+". Ноябрь. Осень.");
                break;
            case 12:
                System.out.println("номер месяца "+number+". Декабрь. Зима.");
                break;
            default:
                System.out.println("Нет такого месяца! Введите число от 1 до 12");
        }
    }
}
