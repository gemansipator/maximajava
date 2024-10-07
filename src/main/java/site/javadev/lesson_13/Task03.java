package site.javadev.lesson_13;

import java.util.ArrayList;

public class Task03 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("роза");  // содержит только "р", удаляется
        strings.add("лоза");  // содержит только "л", добавляется дважды
        strings.add("лира");  // содержит и "р", и "л", остается без изменений

        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    private static ArrayList<String> fix(ArrayList<String> strings) {
        ArrayList<String> result = new ArrayList<>();

        for (String string : strings) {
            if (string.contains("р") && string.contains("л")) {
                // Если слово содержит и "р", и "л", оставляем его без изменений
                result.add(string);
            } else if (string.contains("р")) {
                // Если слово содержит "р", удаляем слово
                continue;  // пропускаем это слово
            } else if (string.contains("л")) {
                // Если слово содержит "л", добавляем его дважды
                result.add(string);  // добавляем слово один раз
                result.add(string);  // добавляем его второй раз
            } else {
                // Если слово не содержит ни "р", ни "л", добавляем его
                result.add(string);
            }
        }

        return result;
    }
}
