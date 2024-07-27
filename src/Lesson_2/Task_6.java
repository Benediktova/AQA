package Lesson_2;

public class Task_6 {
    /*
    Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    public static void main(String args[]) {
        int[] id = {1, 0, 0, 0, 1, 0, 0, 0, 1};

        System.out.print("Изначальный массив: ");
        for (int i = 0; i < id.length; i++) {
            System.out.print(id[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < id.length; i++) {
            if (id[i] == 1) {
                id[i] = 0;
            } else {
                id[i] = 1;
            }
        }
        System.out.print("Измененный массив: ");
        for (int i = 0; i < id.length; i++) {
            System.out.print(id[i] + " ");
            }
        }
}

