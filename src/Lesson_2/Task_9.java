package Lesson_2;

public class Task_9 {
    /*
    Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами
    (можно только одну из диагоналей, если обе сложно).
    Определить элементы одной из диагоналей можно по следующему принципу:
    индексы таких элементов равны, то есть [0][0], [1][1], [2][2], ..., [n][n];
     */
    public static void main(String[] args) {
        int counter = 1;
        int[][] table = new int[4][4];
        System.out.println("Изначальный массив: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                table[i][j] = counter;
                System.out.print(table[i][j] + " ");
                counter++;
            }
            System.out.println();
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    table[i][j] = 1;
                } else if (i + j == 3) {
                    table[i][j] = 1;
                }
            }
        }
        System.out.println("Измененный массив: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(table[i][j] + " ");
           }
            System.out.println();
        }
    }
}
