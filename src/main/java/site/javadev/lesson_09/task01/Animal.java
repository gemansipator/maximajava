package site.javadev.lesson_09.task01;

public abstract class Animal {
    protected String food;
    protected String location;

    abstract void makeNoise();

    abstract void eat();

    abstract void sleep();
}
