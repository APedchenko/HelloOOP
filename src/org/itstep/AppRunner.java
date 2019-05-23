package org.itstep;

public class AppRunner {
    public static void main(String[] args) {
        User me = new User();
        me.name = "Artem";
        me.pasword = "verylongpasword";

        User you = new User();
        you.name = "Your name";
        you.pasword = "Your pass";

        System.out.println("User ME has name"+me.name);
        System.out.println("User YOU has name"+you.name);

    }
}
