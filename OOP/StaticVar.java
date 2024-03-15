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
        System.out.println(firstStu.totalStu);

        // The values of totalStu will be same for the individual objects cause static variables are not dependent
        // on the object but we can still access them by any object's reference variable

        System.out.println(secondStu.sid);
        System.out.println(secondStu.name);
        System.out.println(secondStu.age);
        System.out.println(secondStu.totalStu);
    }
}