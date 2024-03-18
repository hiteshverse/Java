public class StaticMethods {
    static int num;

    static {
        num = 5;
        System.out.println("Static Block Invoked");
    }

    public static void main(String[] args) {
        System.out.println(StaticMethods.num);
    }
}