public class StaticMethods {
    public static void main(String[] args) {
        greeting();
    }


    // AS you know you can't use any non-static stuff inside a static method without creating any instance of that class
    // But you can make this non - static method to a static method you it can be used without creating any instance of the class
    static void greeting() {
        System.out.println("A Greeting Method is Called");
    }
}
