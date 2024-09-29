package site.javadev.Lesson_11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListSpeed {

    public static void main(String[] args) {
        int numberOfOperations = 100000;

        // Тестируем ArrayList и LinkedList
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Тест вставки в конец списка
        System.out.println("\nТестирование вставки в конец списка:");

        // ArrayList - вставка в конец
        long arrayListEndStart = System.currentTimeMillis();
        for (int i = 0; i < numberOfOperations; i++) {
            arrayList.add(i);
        }
        long arrayListEndFinish = System.currentTimeMillis();
        long arrayListEndTime = arrayListEndFinish - arrayListEndStart;
        System.out.println("ArrayList: вставка в конец заняла " + arrayListEndTime + " мс");

        // LinkedList - вставка в конец
        long linkedListEndStart = System.currentTimeMillis();
        for (int i = 0; i < numberOfOperations; i++) {
            linkedList.add(i);
        }
        long linkedListEndFinish = System.currentTimeMillis();
        long linkedListEndTime = linkedListEndFinish - linkedListEndStart;
        System.out.println("LinkedList: вставка в конец заняла " + linkedListEndTime + " мс");

        // Тест вставки в начало списка
        System.out.println("\nТестирование вставки в начало списка:");

        // ArrayList - вставка в начало
        long arrayListStartStart = System.currentTimeMillis();
        for (int i = 0; i < numberOfOperations; i++) {
            arrayList.add(0, i);
        }
        long arrayListStartFinish = System.currentTimeMillis();
        long arrayListStartTime = arrayListStartFinish - arrayListStartStart;
        System.out.println("ArrayList: вставка в начало заняла " + arrayListStartTime + " мс");

        // LinkedList - вставка в начало
        long linkedListStartStart = System.currentTimeMillis();
        for (int i = 0; i < numberOfOperations; i++) {
            linkedList.add(0, i);
        }
        long linkedListStartFinish = System.currentTimeMillis();
        long linkedListStartTime = linkedListStartFinish - linkedListStartStart;
        System.out.println("LinkedList: вставка в начало заняла " + linkedListStartTime + " мс");

        // Ожидания для ArrayList и LinkedList
        System.out.println("\nОжидания:");
        System.out.println("ArrayList:");
        System.out.println("  - Вставка в конец: должна быть быстрой (но может замедляться из-за расширения массива).");
        System.out.println("  - Вставка в начало: будет медленной, так как все элементы сдвигаются вправо.");
        System.out.println("LinkedList:");
        System.out.println("  - Вставка в конец: быстрая, так как элементы добавляются напрямую.");
        System.out.println("  - Вставка в начало: быстрая, так как элементы добавляются напрямую к началу списка.");

        // Реальные результаты тестов
        System.out.println("\nРеальные результаты:");
        System.out.println("ArrayList:");
        System.out.println("  - Вставка в конец заняла: " + arrayListEndTime + " мс");
        System.out.println("  - Вставка в начало заняла: " + arrayListStartTime + " мс");
        System.out.println("LinkedList:");
        System.out.println("  - Вставка в конец заняла: " + linkedListEndTime + " мс");
        System.out.println("  - Вставка в начало заняла: " + linkedListStartTime + " мс");

        System.out.println("\nВывод:");
        System.out.println("  Время работы вставки в конец для ArrayList было быстрым, но может замедляться при расширении.");
        System.out.println("  Вставка в начало для ArrayList была медленной из-за сдвига элементов.");
        System.out.println("  Время вставки для LinkedList было быстрым как в конец, так и в начало, как и ожидалось.");
    }
}
