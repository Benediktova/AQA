package Lesson_5;

public class Circle implements Shape {
    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public void setFillColor(String color) {
        this.fillColor = color;
    }
    @Override
    public void setBorderColor(String color) {
        this.borderColor = color;
    }
    @Override
    public String toString() {
        return String.format("Круг [Площадь: %.2f, Периметр: %.2f, Цвет заливки: %s, Цвет границы: %s]",
                area(), perimeter(), fillColor, borderColor);
    }
}