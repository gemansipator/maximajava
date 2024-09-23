package site.javadev.lesson_09.task02;
/**Создать класс Товар, имеющий переменные имя, цена, рейтинг.
 Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
 Создать класс Basket, содержащий массив купленных товаров.
 Создать класс User, содержащий логин, пароль и объект класса Basket. Создать объект класса User.*/
public class Main {
    public static void main(String[] args) {


        Product [] iphoneProducts = {
                new Product("iPhone 13", 999.99, 4.5),
                new Product("iPhone 6", 699.99, 4.0),
        };
        Product [] tvProducts = {
                new Product("Panasonic", 339.99, 4.2),
                new Product("LG", 779.99, 4.0),
        };

        Category iPhones = new Category("iPhone", iphoneProducts);
        Category tv = new Category("Tv", tvProducts);


        //корзина уже не пустая, так как она инициализируется товарами из категории iPhone.
        Basket basket = new Basket(iphoneProducts);

        User ivan = new User("Papa0998", "Biwe@uf11", basket);


    }
}
