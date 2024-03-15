class Garbage {
    String name;

    Garbage(String str) {
        // System.out.println("Object is Created");
        this.name = str;
    }

    // @Override
    // protected void finalize() throws Throwable {
    //     System.out.println("Object is Destroyed");
    // }
}

public class GarbageColllecy {
    public static void main(String[] args) {
        Garbage first = new Garbage("Hello");

        for(int i = 0; i < 10; i++){
            first = new Garbage("Random");
        }

        System.out.println(first.name);
    }
}
