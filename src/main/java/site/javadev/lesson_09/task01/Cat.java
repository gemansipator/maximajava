package site.javadev.lesson_09.task01;

public class Cat extends Animal{

    int purringVolume; //Громкость мурлыкания в децибелах. Средняя 25

    public Cat(int purringVolume, String food, String location) {
        this.food = food;
        this.location = location;
        this.purringVolume = purringVolume;
    }

    @Override
    void makeNoise() {
        System.out.println("Кошка мяукает  c громкостью в " + purringVolume+ " дБ. " );
    }

    @Override
    void eat() {
        System.out.println("Кошка ест " + food);
    }

    @Override
    void sleep() {
        System.out.println("Кошка спит в " + location);
    }
    @Override
    public String toString() {
        return "Кошка";
    }
}
