package Java_Interview_Questions;

// Polymorphism: Overriding area() method for different shapes
class Shape {
    public double area() {
        return 0;
    }
}

class Rectangle extends Shape {
    int length, width;

    Rectangle(int l, int w) {
        this.length = l;
        this.width = w;
    }

    public double area() {
        return length * width;
    }
}

class Triangle extends Shape {
    int base, height;

    Triangle(int b, int h) {
        this.base = b;
        this.height = h;
    }

    public double area() {
        return 0.5 * base * height;
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(10, 5);
        Shape s2 = new Triangle(10, 4);

        System.out.println("Area of Rectangle: " + s1.area());
        System.out.println("Area of Triangle: " + s2.area());
    }
}

