package Lesson_5;

public class Rectangle implements Shape {
    private double width;
    private double height;
    private String fillColor;
    private String borderColor;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double area() {
        return width * height;
    }
    @Override
    public double perimeter() {
        return 2 * (width + height);
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
        return String.format("Прямоугольник [Площадь: %.2f, Периметр: %.2f, Цвет заливки: %s, Цвет границы: %s]",
                area(), perimeter(), fillColor, borderColor);
    }
}