package Lesson_5;

public class Dog extends Animals {
    private static int dogCount = 0;
    private String name;

    public Dog(String name) {
        super();
        this.name = name;
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println(name + " пробежал " + distance + " м");
        } else {
            System.out.println(name + " не может пробежать больше 500 м");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println(name + " проплыл " + distance + " м");
        } else {
            System.out.println(name + " не может проплыть больше 10 м");
        }
    }
}