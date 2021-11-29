public class CylinderObject {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        c1.radius = 12;
        c1.height = 10;
        System.out.println(c1.lidArea());
        System.out.println(c1.circumference());
        System.out.println(c1.totalSurfaceArea());
    }
}

class Cylinder {
    public double radius;
    public double height;

    public double lidArea() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public double totalSurfaceArea() {
        return 2 * lidArea() * circumference() * height;
    }
}
