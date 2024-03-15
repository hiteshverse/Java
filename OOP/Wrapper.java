public class Wrapper {
    public static void main(String[] args) {
        // int a = 10;

        Integer num = 45;  // Values can't be changed in pass by reference becaue of final class
        // Final class = can't modified the values of the objects inside the class
        // Final keyword = can't modify it's value just like const
        num = 10;
        System.out.println(num.getClass());
    }
}
