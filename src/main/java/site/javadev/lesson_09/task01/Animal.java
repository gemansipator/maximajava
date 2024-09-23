package site.javadev.lesson_09.task01;

public abstract class Animal {
    protected String food;
    protected String location;

    public String getFood() { // Геттер для food
        return food;
    }

    public String getLocation() { // Геттер для location
        return location;
    }

    abstract void makeNoise();

    abstract void eat();

    abstract void sleep();
}
