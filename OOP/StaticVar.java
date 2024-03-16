// Static Variables
class Persons {
    int room_no;
    String name;
    
    // It's a static method that doesn't dependent on the object but still shared among all the objects
    // It's value will be remains for every object of the class
    static int rent = 8000;

    Persons(int room, String person) {
        room_no = room;
        name = person;
    }

    void printInfo() {
        System.out.println(this.room_no + " " + this.name + " " + Persons.rent);
    }
}

public class StaticVar {
    public static void main(String[] args) {
        Persons first = new Persons(1, "Dawg");
        Persons second = new Persons(2, "Epic");

        //Non - Static stuff can't be accessed inside a static method without creating any instance of the class
        first.printInfo();
        second.printInfo();
    }
}