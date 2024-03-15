class Employee {
    int eid;
    String ename;
    int salary;
}

public class ObjectnClass {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.eid = 1;
        e1.ename = "Ramesh";
        e1.salary = 1000;

        System.out.println(e1.eid);
        System.out.println(e1.ename);
        System.out.println(e1.salary);
    }
}