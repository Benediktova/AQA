package Lesson_5;

public abstract class Animals {
    protected static int animalsCount = 0;

    public Animals() {
        animalsCount++;
    }

    public static int getAnimalsCount() {
        return animalsCount;
    }

    public void run(int distance) {
        System.out.println("Животное пробежало " + distance + " м");
    }

    public void swim(int distance) {
        System.out.println("Животное проплыло " + distance + " м");
    }
}
