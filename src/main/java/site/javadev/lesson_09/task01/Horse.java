package site.javadev.lesson_09.task01;

public class Horse extends Animal {
    private int maneLength; // длина гривы в сантиметрах

    public Horse(int maneLength, String food, String location) {
        this.food = food;
        this.maneLength = maneLength;
        this.location = location;
    }


    @Override
    void makeNoise() {
        System.out.println("Лошадь ржёт");
    }

    @Override
    void eat() {
        System.out.println("Лошадь кушает " + food);
    }

    @Override
    void sleep() {
        System.out.println("Лошадь спит в " + location);
    }
    @Override
    public String toString() {
        return "Лошадь";
    }

}
