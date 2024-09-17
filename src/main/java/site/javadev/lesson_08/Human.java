package site.javadev.lesson_08;
/**Задача: Семейная перепись. Создать класс Human с полями имя(String), пол(boolean), возраст(int),
 *  отец(Human), мать(Human).
 Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
Вывести объекты на экран.
Примечание: Если написать свой метод String toString() в классе Human, то именно он будет
 использоваться при выводе объекта на экран.
 Пример вывода: Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя Имя: Катя,
 пол: женский, возраст: 55 Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня ...

 Требования:
 1. Программа не должна считывать данные с клавиатуры.
 2. Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
 3. Добавить в класс конструктор public Human(String name, boolean sex, int age).
 4. Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father,
 Human mother).
 5. Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними).
 6. Выведи созданные объекты на экран.*/

public class Human {
    private final String name;  //имя
    private final boolean sex;
    private final int age;
    private Human father;
    private Human mother;


    public String toString() {
        String fatherInfo = (father != null) ? father.name : "нет отца";
        String motherInfo = (mother != null) ? mother.name : "нет матери";

        String gender = sex ? "мужской" : "женский";

        return "Имя: " + name + "\nПол: " + gender + "\nВозраст: " + age +
                "\nОтец: " + fatherInfo + "\nМать: " + motherInfo + "\n";
    }

    public Human(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Human(String name, boolean sex, int age, Human father, Human mother) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }

}
