/*
Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException и вывести результат расчета.
*/
public class Lesson_7 {
    public static void main(String[] args) {
        String[][] arr = new String[][]{
                {"1", "2", "3", "5"},
                {"2", "4", "2", "3"},
                {"1", "6", "P", "2"},
                {"2", "2", "2", "2"},
        };
        try {
            try {
                int result = method(arr);
                System.out.println(result);
            } catch (MyArraySizeException m) {
                System.out.println("Размер массива превышен!");
            }
        }
        catch (MyArrayDataException m) {
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка в ячейке: " + m.str + "x" + m.col);
        }

    }


    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int str = 0; str < arr.length; str++) {
            for (int col = 0; col < arr[str].length; col++) {
                try {
                    count = count + Integer.parseInt(arr[str][col]);
                }
                catch (NumberFormatException n) {
                    throw new MyArrayDataException(str, col);
                }
            }

        }
        return count;
    }
}