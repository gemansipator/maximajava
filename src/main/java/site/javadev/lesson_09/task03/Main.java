package site.javadev.lesson_09.task03;
/**Создать класс Person, который содержит:
 переменные fullName, age;
 методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
 Добавьте два конструктора  - Person() и Person(fullName, age).
 Создайте два объекта этого класса. Один объект инициализируется конструктором Person(),
 другой - Person(fullName, age).*/
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Person person2 = new Person("Иван", 25);

    }
}
