public class InheritanceCircle {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();

        c.radius = 7;
        c.height = 10;

        System.out.println("Volume " + c.volume());
        System.out.println("Area " + c.area());

    }
}

class Circle {
    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double Perimeter() {
        return 2 * Math.PI * radius;
    }

    public double Circumference() {
        return Perimeter();
    }
}

class Cylinder extends Circle {
    public double height;

    public double volume() {
        return area() * height;
    }
}