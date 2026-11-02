package kz.learning.hello;

public class Greeter {
    static String greet(String name) {
        if (name == null || name.isBlank()) {
            return "Привет, мир!";
        } else {
            return "Привет, " + name + "!";
        }
    }

    public static void main(String[] args) {
        String name = args.length > 0 ? args[0] : null;
        System.out.println(greet(name));
    }
}
