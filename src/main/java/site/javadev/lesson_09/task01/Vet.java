package site.javadev.lesson_09.task01;
//Класс ветеринар
public class Vet {
    public void treatAnimal(Animal animal) {
        System.out.println("Ветеринар осматривает " + animal);
        System.out.println("Еда: " + animal.food);
        System.out.println("Местоположение: " + animal.location);

        animal.sleep();
    }
}