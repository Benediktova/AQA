package Lesson_5;

public class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;
    private String fillColor;
    private String borderColor;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    @Override
    public double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)); // Формула Герона
    }
    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
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
        return String.format("Треугольник [Площадь: %.2f, Периметр: %.2f, Цвет заливки: %s, Цвет границы: %s]",
                area(), perimeter(), fillColor, borderColor);
    }
}