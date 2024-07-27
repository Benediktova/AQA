package Lesson_2;

public class Task_1 {
    /*
    Написать метод, принимающий на вход два целых числа и проверяющий,
    что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */

    public static boolean sum(int a, int b) {
          int sum = a + b;
          return sum >= 10 && sum <= 20;
            }

            public static void main(String[] args) {
            int a = 15;
            int b = 1;
            boolean result = sum(a, b);
            System.out.println(result);
            }
}