package site.javadev.lesson_16;

import lombok.*;

/**
 * Класс User с использованием Lombok.
 * Lombok автоматически генерирует конструкторы, геттеры, сеттеры и метод toString.
 */
@Getter // Автоматически генерирует геттеры для всех полей
@Setter //Автоматически генерирует сеттеры для всех полей
@ToString //Автоматичеки генерирует метод toString
@AllArgsConstructor //Генерирует конструктор, который принимает все поля в качестве параметров
@NoArgsConstructor //Генерирует конструктор без параметров
public class User {
    private String name;
    private int age;
}
