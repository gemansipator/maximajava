package site.javadev.lesson_09.task02;
/**Создать класс Товар, имеющий переменные имя, цена, рейтинг.
 Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
 Создать класс Basket, содержащий массив купленных товаров.
 Создать класс User, содержащий логин, пароль и объект класса Basket. Создать объект класса User.*/
public class Main {
    public static void main(String[] args) {


        Category iPhone = new Category();
        Category Tablet = new Category();
        Category Android = new Category();
        Basket basket = new Basket(iPhone.products);

        User ivan = new User("Papa0998", "Biwe@uf11", iPhone);




    }
}
