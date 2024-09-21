package site.javadev.lesson_09.task02;

public class Category {
    String name; // имя категории
    Product[] products; // массив товаров
    public Category(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }
}
