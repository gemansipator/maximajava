# Пояснение для Task02

Объяснение работы кода:
Метод main:

Считывает число с консоли.
Вызывает метод sumOfDigits для вычисления суммы цифр и выводит результат.
Метод sumOfDigits:

Если number равно 0, функция возвращает 0, это базовый случай рекурсии.
Вычисляет последнюю цифру с помощью number % 10.
Определяет оставшуюся часть числа с помощью number / 10.
Рекурсивно вызывает sumOfDigits для оставшейся части числа и добавляет к результату последнюю цифру.
Как это работает на примере:
Для числа 123:

sumOfDigits(123):

lastDigit = 3
remainingNumber = 12
sumOfDigits(12) + 3
sumOfDigits(12):

lastDigit = 2
remainingNumber = 1
sumOfDigits(1) + 2
sumOfDigits(1):

lastDigit = 1
remainingNumber = 0
sumOfDigits(0) + 1
sumOfDigits(0) возвращает 0.

Итоговая сумма цифр = 3 + 2 + 1 + 0 = 6.