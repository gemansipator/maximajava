package site.javadev.lesson_09.task03;

public class Person {

    String fullName; // полное имя человека
    int age; // возраст человека

    void move(){  // человек движется
        System.out.println(fullName + " is moving.");
    };
    void talk(){  //  человек говорит
        System.out.println(fullName + " is talking.");
    };

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
}
