package site.javadev.lesson_09.task02;

public class User {
    private String login;
    private String password;
    Category basket;

    public User(String login, String password, Category basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }

}
