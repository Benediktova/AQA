/*
Необходимо написать программу, позволяющую выполнить следующее:

1. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
2. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
3. Для хранения фруктов внутри коробки можно использовать ArrayList;
4. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
5. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра.
true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
6. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
7. Не забываем про метод добавления фрукта в коробку.
*/

package Lesson_10;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.println("Вес коробки с яблоками: " + appleBox.getWeight() + " f");
        System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeight() + " f");

        System.out.println("Сравнение коробок: " + appleBox.compare(orangeBox));


        Box<Apple> anotherAppleBox = new Box<>();
        appleBox.transferFruitsTo(anotherAppleBox);
        System.out.println("Вес новой коробки с яблоками после пересыпания: " + anotherAppleBox.getWeight() + " f");
        System.out.println("Вес коробки с яблоками после пересыпания: " + appleBox.getWeight() + " f");
    }
}