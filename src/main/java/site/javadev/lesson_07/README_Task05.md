# Cтрелки (->) в конструкции switch

стрелки (->) в конструкции switch не являются 
лямбда-выражениями. Они являются частью синтаксиса 
switch-выражения, который был введён в Java 12 и 
выше. Этот синтаксис позволяет более лаконично
возвращать значения из switch и делает код более
читабельным.

Вот как это выглядит:
```private static double calc(int num1, int num2, char operation) {
    return switch (operation) {
        case '+' -> num1 + num2;
        case '-' -> num1 - num2;
        case '*' -> num1 * num2;
        case '/' -> {
            if (num2 == 0) {
                System.out.println("Ошибка: деление на ноль!");
                yield -1;
            }
            yield (double) num1 / num2;
        }
        default -> {
            System.out.println("Ошибка: неизвестная операция");
            yield -1;
        }
    };
}
```
В этом примере:

-> используется для указания того, что будет возвращено в каждом случае.
yield используется для возврата значения в блоках case, когда требуется выполнение дополнительного кода.
Примеры использования:
Стрелка (->): В switch-выражении используется для указания значений, возвращаемых для каждого case.
Лямбда-выражения: Используются для определения анонимных функций, особенно в контексте функциональных интерфейсов (например, Runnable, Callable, Function, и т. д.).
Лямбда-выражение в Java выглядит так:

```
(x) -> x * x
```
Оно представляет собой короткий способ создания экземпляра функционального интерфейса, в котором можно использовать анонимные функции.

Итог
-> в switch-выражении это не лямбда, а часть нового синтаксиса switch.
Лямбда-выражения используются для определения функциональных интерфейсов и не связаны с синтаксисом switch.







