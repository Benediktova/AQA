package Lesson_2;

public class Task_4 {

    /*
    Написать метод, которому в качестве аргументов передается строка и число,
    метод должен отпечатать в консоль указанную строку, указанное количество раз;
     */

    public static void printText(String text, int times) {
        text = String.format("Я буду печататься %d раз(а).", times);
          for (int a = 0; a < times; a++) {
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        int times = 15;
        printText("", times);
    }
}

