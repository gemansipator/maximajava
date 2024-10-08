package site.javadev.lesson_03;

import java.util.Scanner;

/** 7. Работа светофора для пешеходов запрограммирована следующим образом:
 в начале каждого часа в течение трех минут горит зелёный сигнал,
 затем в течение одной минуты - жёлтый,
 а потом в течение одной минуты - красный,
 затем опять зелёный горит три минуты и т. д.
 Подать программе вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
 Определить, сигнал какого цвета горит для пешеходов в этот момент.
 Результат вывести на экран в следующем виде:
 "зелёный" - если горит зелёный цвет,
 "жёлтый" - если горит жёлтый цвет,
 "красный" - если горит красный цвет.*/
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите время в минутах: ");
        double t = scanner.nextDouble();  // Используем double для вещественного числа

        double remainder = t % 5;

        if(remainder <3){
            System.out.println("Зеленый сигнал");

        }else if (remainder < 4){
            System.out.println("Желтый сигнал");
        }else {
            System.out.println("Красный сигнал");  // в остальных случаях остаток будет 4
        }
    }

}
/**Примеры с результатом деления и остатком от деления

 Для каждого примера мы будем указывать:

 Результат деления: это сколько раз делитель полностью помещается в делимое.
 Остаток от деления: это то, что "остаётся" после полного деления.

 1 % 5
 Деление: 1 ÷ 5
 Результат деления: 0 (5 не помещается в 1 ни разу)
 Остаток от деления: 1 (так как 1 - (5 * 0) = 1)
 Вывод: 1 % 5 = 1

 2 % 5
 Деление: 2 ÷ 5
 Результат деления: 0 (5 не помещается в 2 ни разу)
 Остаток от деления: 2 (так как 2 - (5 * 0) = 2)
 Вывод: 2 % 5 = 2

 3 % 5
 Деление: 3 ÷ 5
 Результат деления: 0 (5 не помещается в 3 ни разу)
 Остаток от деления: 3 (так как 3 - (5 * 0) = 3)
 Вывод: 3 % 5 = 3

 4 % 5
 Деление: 4 ÷ 5
 Результат деления: 0 (5 не помещается в 4 ни разу)
 Остаток от деления: 4 (так как 4 - (5 * 0) = 4)
 Вывод: 4 % 5 = 4

 5 % 5
 Деление: 5 ÷ 5
 Результат деления: 1 (5 помещается в 5 ровно один раз)
 Остаток от деления: 0 (так как 5 - (5 * 1) = 0)
 Вывод: 5 % 5 = 0

 6 % 5
 Деление: 6 ÷ 5
 Результат деления: 1 (5 помещается в 6 один раз)
 Остаток от деления: 1 (так как 6 - (5 * 1) = 1)
 Вывод: 6 % 5 = 1

 7 % 5
 Деление: 7 ÷ 5
 Результат деления: 1 (5 помещается в 7 один раз)
 Остаток от деления: 2 (так как 7 - (5 * 1) = 2)
 Вывод: 7 % 5 = 2

 8 % 5
 Деление: 8 ÷ 5
 Результат деления: 1 (5 помещается в 8 один раз)
 Остаток от деления: 3 (так как 8 - (5 * 1) = 3)
 Вывод: 8 % 5 = 3

 9 % 5
 Деление: 9 ÷ 5
 Результат деления: 1 (5 помещается в 9 один раз)
 Остаток от деления: 4 (так как 9 - (5 * 1) = 4)
 Вывод: 9 % 5 = 4

 10 % 5
 Деление: 10 ÷ 5
 Результат деления: 2 (5 помещается в 10 ровно два раза)
 Остаток от деления: 0 (так как 10 - (5 * 2) = 0)
 Вывод: 10 % 5 = 0

 Заключение

 Как видим, операция остатка от деления (%) показывает оставшуюся часть после деления нацело. Если делимое меньше
 делителя, результат деления нацело будет 0, а остаток равен делимому. Если делимое кратно делителю,
 остаток равен 0.*/