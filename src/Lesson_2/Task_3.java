package Lesson_2;

public class Task_3 {
    /*
    Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
     */

    public static void main(String[] args) {
        int a = -1;
        boolean result = booleanValue(a);
        System.out.println(result);
    }

    public static boolean booleanValue(int a) {
        return a < 0 ? true : false;
    }
}


