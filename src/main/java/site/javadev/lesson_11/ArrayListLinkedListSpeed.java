package site.javadev.lesson_11;
/**
 * Кроме задач необходимо сделать замеры сравнения
 * ArrayList и LinkedList и сделать скриншоты с вашими результатами
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListSpeed {
    public static void main(String[] args) {

        // Ожидания
        System.out.println("Ожидания:");
        System.out.println("ArrayList:");
        System.out.println(" - Вставка в конец: должна быть быстрой (но может замедляться из-за расширения массива).");
        System.out.println(" - Вставка в начало: будет медленной, так как все элементы сдвигаются вправо.");
        System.out.println("LinkedList:");
        System.out.println(" - Вставка в конец: быстрая, так как элементы добавляются напрямую.");
        System.out.println(" - Вставка в начало: быстрая, так как элементы добавляются напрямую к началу списка.\n");

        // Тестирование вставки в конец списка
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        int elementCount = 100_000;

        // Вставка в конец для ArrayList
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < elementCount; i++) {
            arrayList.add(i);
        }
        long arrayListEndInsertTime = System.currentTimeMillis() - startTime;

        // Вставка в конец для LinkedList
        startTime = System.currentTimeMillis();
        for (int i = 0; i < elementCount; i++) {
            linkedList.add(i);
        }
        long linkedListEndInsertTime = System.currentTimeMillis() - startTime;

        // Тестирование вставки в начало списка
        // Вместо очистки создаём новый ArrayList
        arrayList = new ArrayList<>();
        linkedList.clear();

        // Вставка в начало для ArrayList
        startTime = System.currentTimeMillis();
        for (int i = 0; i < elementCount; i++) {
            arrayList.add(0, i);
        }
        long arrayListStartInsertTime = System.currentTimeMillis() - startTime;

        // Вставка в начало для LinkedList
        startTime = System.currentTimeMillis();
        for (int i = 0; i < elementCount; i++) {
            linkedList.add(0, i);
        }
        long linkedListStartInsertTime = System.currentTimeMillis() - startTime;

        // Вывод реальных результатов
        System.out.println("Реальные результаты:");
        System.out.println("ArrayList:");
        System.out.println(" - Вставка в конец заняла: " + arrayListEndInsertTime + " мс");
        System.out.println(" - Вставка в начало заняла: " + arrayListStartInsertTime + " мс");
        System.out.println("LinkedList:");
        System.out.println(" - Вставка в конец заняла: " + linkedListEndInsertTime + " мс");
        System.out.println(" - Вставка в начало заняла: " + linkedListStartInsertTime + " мс");

    }
}
