/*
Необходимо написать программу, позволяющую выполнить следующее:

1. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
2. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
3. Для хранения фруктов внутри коробки можно использовать ArrayList;
4. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
5. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
6. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;

7. Не забываем про метод добавления фрукта в коробку.
*/
package Lesson_10;
import java.util.ArrayList;
import java.util.List;

class Box<T extends Fruit> {
    private List<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        return fruits.size() * (fruits.isEmpty() ? 0 : fruits.get(0).getWeight());
    }

    public boolean compare(Box<?> otherBox) {
        return this.getWeight() == otherBox.getWeight();
    }

    public void transferFruitsTo(Box<T> anotherBox) {
        if (fruits.isEmpty()) return;
        if (anotherBox.getClass() != this.getClass()) {
            throw new IllegalArgumentException("Нельзя пересыпать фрукты разных типов");
        }
        anotherBox.fruits.addAll(fruits);
        fruits.clear();
    }
}

