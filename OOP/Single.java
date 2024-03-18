class SingletonClass {
    private static SingletonClass obj;

    private SingletonClass(){

    }

    static SingletonClass getObj() {
        if(obj == null){
            obj = new SingletonClass();
        }

        return obj;
    }
}

public class Single {
    public static void main(String[] args) {
        SingletonClass obj = SingletonClass.getObj();
        SingletonClass obj1 = SingletonClass.getObj();

        System.out.println(obj);
        System.out.println(obj1);
    }
}
