public class Circle {
    private double radius;

    // hàm tạo mặc định
    public Circle() {
        radius = 1.0;
    }

    // hàm tạo có tham số
    public Circle(double r) {
        radius = r;
    }

    // getter
    public double getRadius() {
        return radius;
    }

    // setter
    public void setRadius(double r) {
        radius = r;
    }

    // tính diện tích
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // tính chu vi
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // toString
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
    
}