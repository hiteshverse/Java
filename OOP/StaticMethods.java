public class StaticMethods {
    static int num;

    // A static block can be called before the main method during the classloading
    static {
        System.out.println("Static Block Invoked : " + StaticMethods.num);
    }
    public static void main(String[] args) {
        
        System.out.println("Hello World");
    }
}