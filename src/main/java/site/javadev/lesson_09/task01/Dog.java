package site.javadev.lesson_09.task01;

public class Dog extends Animal{

    private int loyaltyLevel;    //Уровень преданности хозяину. от 1 до 10

    public Dog( int loyaltyLevel, String food, String location) {
        this.food = food;
        this.location = location;
        this.loyaltyLevel = loyaltyLevel;

    }

    @Override
    void makeNoise() {
        System.out.println("Собака гавкает");
    }

    @Override
    void eat() {
        System.out.println("Собака ест");
    }

    @Override
    void sleep() {
        System.out.println("Собака спит");

    }
    @Override
    public String toString() {
        return "Собака";
    }

}
