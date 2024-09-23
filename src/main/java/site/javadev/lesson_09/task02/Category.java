package site.javadev.lesson_09.task02;

public class Category {
    private String name; // имя категории
    private Product[] products; // массив товаров
    public Category(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }
}
