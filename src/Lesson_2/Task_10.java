package Lesson_2;

public class Task_10 {
    /*
    Написать метод, принимающий на вход два аргумента: len и initialValue,
    и возвращающий одномерный массив типа int длиной len,
    каждая ячейка которого равна initialValue.
     */
    public static int [] array(int len, int initialValue)  {
        int [] id = new int[len];
        for (int i = 0; i < id.length; i++) {
            id[i] = initialValue;
        }
        return id;
    }
    public static void main(String[] args) {
        int len = 2;
        int initialValue = 5;
        int [] id = array(len, initialValue);
        for (int i = 0; i < id.length; i++) {
            System.out.print(id[i] + " ");
        }
    }
}
