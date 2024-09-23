package site.javadev.lesson_09.task02;

public class User {
    private String login;
    private String password;
    Basket basket;

    public User(String login, String password, Basket basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }
}
