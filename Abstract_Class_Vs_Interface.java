interface Drawable {
    void draw();
}

abstract class Shape {
    abstract double area();
}

class Circle extends Shape implements Drawable {
    double r = 5;
    double area() {
        return 3.1416 * r * r;
    }
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape implements Drawable {
    double l = 4, w = 6;
    double area() {
        return l * w;
    }
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class Q3_AbstractInterface {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        System.out.println(s1.area());
        System.out.println(s2.area());
    }
}
