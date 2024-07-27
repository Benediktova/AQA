package Lesson_2;

public class Task_8 {
    /*
    Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    public static void main(String[] args) {
        int [] id = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.print("Изначальный массив: ");
        for (int i = 0; i < id.length; i++) {
            System.out.print(id[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < id.length; i++) {
            if (id[i] < 6) {
                id[i]*= 2;
            }
        }

        System.out.print("Измененный массив: ");
        for (int i = 0; i < id.length; i++) {
            System.out.print(id[i] + " ");
        }
    }
}
