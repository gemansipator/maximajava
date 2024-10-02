package site.javadev.lesson_12;

import java.util.TreeSet;

/**
 * Сортировка с монетой.
 * Если у 2 монет прайс одинаковый - нужно сравнивать монеты по номиналу.
 * Если и номинал одинаковый, то сравнивать по стране выпуска.
 * Если и страна выпуска одна, то сравнивать по диаметру.
 */
public class Main {
   public static void main(String[] args) {

      // Создаем компаратор для сортировки монет
      CoinComparator coinComparator = new CoinComparator();

      // Создаем TreeSet для монет с использованием компаратора
      TreeSet<Coin> coinSet = new TreeSet<>(coinComparator);

      // Добавляем несколько объектов Coin в набор
      coinSet.add(new Coin(5, 25.0, "USA", 1995));
      coinSet.add(new Coin(5, 24.5, "Canada", 1995));
      coinSet.add(new Coin(5, 25.0, "USA", 2000));
      coinSet.add(new Coin(10, 30.0, "UK", 2005));
      coinSet.add(new Coin(5, 25.0, "USA", 1995)); // Дубликат, не добавится

      // Выводим отсортированные монеты
      for (Coin coin : coinSet) {
         System.out.println(coin);
      }
   }
}
