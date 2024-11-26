package Lesson_5;

/*
Задача 1:

Создать классы Собака и Кот с наследованием от класса Животное.
Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль.
(Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
Добавить подсчет созданных котов, собак и животных.
Решить задачу про котов и тарелки с едой, выполнив следующие пункты:
Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
*/

public class Lesson_5 {
    public static void main(String[] args) {

        System.out.println("Задание №1: ");

        Dog dogSam = new Dog("Sam");
        dogSam.run(10);
        dogSam.swim(-1);

        Cat catKris = new Cat("Kris");
        catKris.run(250);
        catKris.swim(5);

        Bowl bowl = new Bowl(15);

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Kris");
        cats[1] = new Cat("Barsik");
        cats[2] = new Cat("Vasya");

        for (Cat cat : cats) {
            cat.eat(bowl);

        }
        for (int i = 0; i < cats.length; i++) {
            System.out.println("Кот " + (i + 1) + (cats[i].isFull() ? " сытый." : " голодный."));
        }
        bowl.addFood(10);

        for (Cat cat : cats) {
            cat.eat(bowl);
        }
        for (int i = 0; i < cats.length; i++) {
            System.out.println("Кот " + (i + 1) + (cats[i].isFull() ? " сытый." : " голодный."));
        }
        System.out.println();

        System.out.println("Всего животных: " + Animals.getAnimalsCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего котов: " + Cat.getCatCount());
        System.out.println("--------------------------------------------------");
        System.out.println("Задание №2: ");

/*
Задача 2:

Применяя интерфейсы написать программу расчета периметра и площади геометрических фигур: круг, прямоугольник, треугольник.

Задать для каждой фигуры цвет заливки и цвет границы.

Результат полученных характеристик [ Периметр, площадь, цвет фона, цвет границ ] по каждой фигуре вывести в консоль.

Попробуйте реализовать базовые методы, такие как расчет периметра фигур, в качестве дефолтных методов в интерфейсе.
*/

        Shape circle = new Circle(5, "Зеленый", "Чёрный");
        Shape rectangle = new Rectangle(4, 6, "Голубой", "Синий");
        Shape triangle = new Triangle(3, 4, 5, "Розовый", "Фиолетовый");

        printShapeInfo(circle);
        printShapeInfo(rectangle);
        printShapeInfo(triangle);
    }

    private static void printShapeInfo(Shape shape) {
        System.out.println("Форма: " + shape.getClass().getSimpleName());
        System.out.println("Периметр: " + shape.perimeter());
        System.out.println("Площадь: " + shape.area());
        System.out.println("Цвет заливки: " + shape.getFillColor());
        System.out.println("Цвет границ: " + shape.getBorderColor());
        System.out.println();
    }
}