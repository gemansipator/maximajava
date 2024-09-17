package site.javadev.lesson_08;

public class Main {
    public static void main(String[] args) {
        Human grandfather = new Human("Кирилл", true, 99);
        Human grandfather2 = new Human("Мефодий", true, 98);
        Human grandmother = new Human("Афросья", false, 89);
        Human grandmother2 = new Human("Мария", false, 91);
        Human father = new Human("Пётр", true, 60, grandfather, grandmother);
        Human mother = new Human("Екатерина", false, 59, grandfather2, grandmother2);
        Human children1 = new Human("Аркадий", true, 15, father, mother);
        Human children2 = new Human("Михаил", true, 13, father, mother);
        Human children3 = new Human("Мелисса", false, 10, father, mother);

        Human [] humans = {
            grandfather, grandmother, grandfather2, grandmother2, father,
                mother, children1, children2, children3
        };

        for (Human human : humans) {
            System.out.println(human);
        }
    }
}
