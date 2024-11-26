package Lesson_5;

 class Dog extends Animals {
    private static int dogCount = 0;
    private String name;
    private int distance;

    public Dog(String name) {
        super();
        this.name = name;
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

    @Override
    void run(int distance) {
        if (distance <= 0) {
            System.out.println(name + " не может пробежать меньше 0 м");
        }    else if (distance > 0 && distance <= 500) {
            System.out.println(name + " пробежал " + distance + " м");
        } else {
            System.out.println(name + " не может пробежать больше 500 м");
        }
    }

    @Override
    void swim(int distance) {
        if (distance <= 0) {
            System.out.println(name + " не может проплыть меньше 0 м");
        }    else if (distance > 0 && distance <= 10) {
            System.out.println(name + " проплыл " + distance + " м");
        } else {
            System.out.println(name + " не может проплыть больше 10 м");
        }
    }
}