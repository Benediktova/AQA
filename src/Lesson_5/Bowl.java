package Lesson_5;

public class Bowl {
    int foodCount;

    public Bowl(int initialFood) {
        this.foodCount = initialFood;
    }
    public void addFood(int count) {
        if (count > 0) {
            foodCount += count;
            System.out.println(count + " единиц еды добавлено в миску.");
        } else {
            System.out.println("Нельзя добавить отрицательное количество еды.");
        }
    }
    public boolean feedCat(int count) {
        if (foodCount >= count) {
            foodCount -= count;
            System.out.println("Кот съел " + count + " единиц еды.");
            return true;
        } else {
            System.out.println("Недостаточно еды в миске. Кот не покушал.");
            return false;
        }
    }
}