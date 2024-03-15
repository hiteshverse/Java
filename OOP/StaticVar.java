class Student {
    int sid;
    String name;
    int age;
    static int totalStu;

    Student(int id, String student, int stuAge) {
        this.sid = id;
        this.name = student;
        this.age = stuAge;
        Student.totalStu += 1;
    }
}

public class StaticVar {
    public static void main(String[] args) {
        Student firstStu = new Student(1, "Tom", 19);
        Student secondStu = new Student(2, "Jerry", 20);

        System.out.println(firstStu.sid);
        System.out.println(firstStu.name);
        System.out.println(firstStu.age);
        System.out.println(Student.totalStu);

        // The values of totalStu will be same for the individual objects cause static variables are not dependent
        // on the object but we can still access them by any object's reference variable but it's not a good pratice
        // for accesing any static varible we should always use the class name before the static variable just like this className.static_var_name
        // One more thing we can access the static varibles without creating any object of that class

        System.out.println(secondStu.sid);
        System.out.println(secondStu.name);
        System.out.println(secondStu.age);
        System.out.println(Student.totalStu);
    }
}