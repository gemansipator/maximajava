package site.javadev.lesson_16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    @DisplayName("Проверка создания пользователя\"")
    public void testUserCreation() {
        // Создаем нового пользователя
        User user = new User("Иван", 18);

        // Проверяем, что пользователь создан с правильными данными
        Assertions.assertEquals("Иван", user.getName());
        Assertions.assertEquals(18, user.getAge());
    }

    @Test
    @DisplayName("Проверка создания пользователя\"")
    public void testUserAgeUpdate() {
        // Создаем нового пользователя
        User user = new User("Мария", 25);

        // Обновляем возраст
        user.setAge(26);

        // Проверяем, что возраст обновился
        Assertions.assertEquals(26, user.getAge());
    }
}
