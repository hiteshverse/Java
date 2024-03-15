class Test {
    int rollno;
    String name;
    float marks;

    Test() {
        this (1, "Ramesh", 334.0f);
    }

    Test(Test Other){
        this.rollno = Other.rollno;
        this.name = Other.name;
        this.marks = Other.marks;
    }

    Test(int no, String naam, float mark){
        this.rollno = no;
        this.name = naam;
        this.marks = mark;
    }
}

public class Constructors {
    public static void main(String[] args) {
        Test student1 = new Test();

        Test student2 = new Test(2, "Jeet", 34.5f);

        Test student3 = new Test(student2);

        Test one = new Test();
        one.name = "Dev";

        Test two = one;
        System.out.println(two.name);
        System.out.println(two.rollno);

        System.out.println(student1.rollno);
        System.out.println(student1.name);
        System.out.println(student1.marks);
        System.out.println();
        
        System.out.println(student2.rollno);
        System.out.println(student2.name);
        System.out.println(student2.marks);
        System.out.println();

        System.out.println(student3.rollno);
        System.out.println(student3.name);
        System.out.println(student3.marks);
    }
}
