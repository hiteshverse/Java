// Outer is not dependent on any other classes
// So we can directly use it by creating an object of the class
class Outer {
    int num = 1;
}



public class OuterClass {

    // The Inner class in dependent on the outerclass so firstly it need an object of the outer class
    // or else we can make it static so we don't need to create object of the outer class
    // we can directly create an object of the innerclass and able to use it

    static class InnerClass {
        String name = "John Doe";
    }

    public static void main(String[] args) {
        InnerClass obj = new InnerClass();
        Outer obj1 = new Outer();

        System.out.println(obj.name);
        System.out.println(obj1.num);
    }
}