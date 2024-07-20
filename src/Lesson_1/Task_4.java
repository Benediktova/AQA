package Lesson_1;

public class Task_4 {
    /*
    4. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
    и инициализируйте их любыми значениями, которыми захотите.
    Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”,
    в противном случае “a < b”;
    */

    //public static void main(String[] args) {
    public void compareNumbers() {
        int a = 22;
        int b = 112;
        if (a >= b) {
            System.out.println("a >= b");
        } else  {
            System.out.println("a < b");
        }
    }
}
