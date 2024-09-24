package site.javadev.lesson_09.task01;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat(25, "Рыба", "Кровать");
        Dog dog = new Dog(10, "Мясо кролика", "Конура");
        Horse horse = new Horse(25, "Сено", "загон");
        Vet vet = new Vet();

        Animal [] animals = {cat, dog, horse};
        for (int i = 0; i < animals.length; i++) {
            vet.treatAnimal(animals[i]);
        }
    }

}
