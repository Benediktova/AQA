package Lesson_2;

public class Task_7 {
    /*
    Задать пустой целочисленный массив длиной 100.
    С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100;
     */
    public static void main(String[] args) {
        int[] id = new int[100];
        for (int i = 0; i < id.length; i++) {
            id[i] = i + 1;
            System.out.print(id[i] + " ");
        }
    }
}
