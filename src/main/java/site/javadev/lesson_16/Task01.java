package site.javadev.lesson_16;

import lombok.extern.slf4j.Slf4j;

/**LOMBOK
 * ...настраиваю прежде проект на Maven, чтобы подключить ломбок, добавляю логирование от ломбок в файл, настраиваю
 * логгирование*/

@Slf4j // Аннотация для автоматического создания логгер
public class Task01 {
    public static void main(String[] args) {
        //Создание пользователя с использованием  конструктора без параметров
        User user1 = new User();
        user1.setName("Иван");
        user1.setAge(18);
        log.info("Создан пользователь: {}", user1);

        // Создание пользователя с использованием конструктора с параметрами
        User user2 = new User("Мария", 25);
        log.info("Создан пользователь: {}", user2);

        // Изменение возраста пользователя
        user2.setAge(26);
        log.info("Возраст пользователя обновлён: {}", user2);
        try {
            int a = 1 / 0;
        } catch (Exception e) {
            log.error("Произошла ошибка: ", e);
        }

    }
}
