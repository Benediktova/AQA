package Lesson_2;

public class Task_2 {
/*
Написать метод, которому в качестве параметра передается целое число,
метод должен напечатать в консоль, положительное ли число передали или отрицательное.
Замечание: ноль считаем положительным числом.
 */
    public static int printValue(int a) {
        if (a >= 0) {
            System.out.println("Число передали положительное: " + a);
        }  else {
            System.out.println("Число передали отрицательное: " + a);
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 0;
        printValue(a);
        }
}
