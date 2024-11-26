package Lesson_5;

public abstract class Animals {
    protected static int animalsCount = 0;

    public Animals() {
        animalsCount++;
    }

    public static int getAnimalsCount() {
        return animalsCount;
    }

    abstract void run(int distance);
    abstract void swim(int distance);
}
