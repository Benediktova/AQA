/*
Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
Посчитать, сколько раз встречается каждое слово. (реализовать с использованием коллекций)
*/

package Lesson_8;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String[] words = {
                "пион", "василек", "подсолнух", "пион", "тюльпан",
                "фиалка", "подсолнух", "подсолнух", "тюльпан", "гербер",
                "тюльпан", "роза", "ромашка", "колокольчик", "одуванчик",
                "кактус", "василек", "пион"
        };

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Уникальные слова и их количество:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

/*
Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
*/

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "123-45-67");
        phoneBook.add("Иванов", "984-43-34");
        phoneBook.add("Петров", "987-65-32");
        phoneBook.add("Сидоров", "777-77-77");

        System.out.println("Номера телефонов Иванова: " + phoneBook.get("Иванов"));
        System.out.println("Номера телефонов Петрова: " + phoneBook.get("Петров"));
        System.out.println("Номера телефонов Сидорова: " + phoneBook.get("Сидоров"));
        System.out.println("Номера телефонов Смирнова: " + phoneBook.get("Смирнов"));
    }
}