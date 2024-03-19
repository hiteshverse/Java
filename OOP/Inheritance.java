class Shape{
    int length;
    int width;

    // Default Constructor with No Arguments
    Shape(){
        this.length = 1;
        this.width = 1;
    }

    // Parameterized Constructor with two Arguments
    Shape(int l, int w){
        this.length = l;
        this.width = w;
    }

    // Copy Constructor with one Arguments
    Shape(Shape other){
        this.length = other.length;
        this.width = other.width;
    }
}

// Inheriting the base class into child class
class Rectangle extends Shape {
    int weight;



}

public class Inheritance {
    public static void main(String[] args) {
        // Shape obj = newT Shape();  // Calling the Deafult Constructor
        // System.out.println(obj.length + " " + obj.width);

        // Shape obj1 = new Shape(5, 29);
        // System.out.println(obj1.length + " " + obj1.width);  // Calling the Parameterized Constructor

        // Shape obj2 = new Shape(obj1);
        // System.out.println(obj2.length + " " + obj2.width);

        Rectangle rect = new Rectangle();
        System.out.println(rect.length + " " + rect.width + " " + rect.weight);
    }
}
