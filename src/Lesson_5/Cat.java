package Lesson_5;

 class Cat extends Animals {
    private static int catCount = 0;
    private String name;
    private boolean isFull;

    public Cat(String name) {
        super();
        this.name = name;
        catCount++;
        isFull = false;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    void run(int distance) {
        if (distance <= 0) {
            System.out.println(name + " не может пробежать меньше 0 м");
        } else if (distance > 0 && distance <= 200) {
            System.out.println(name + " пробежал " + distance + " м");
        } else {
            System.out.println(name + " не может пробежать больше 200 м");
        }
    }

    @Override
     void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }
     void eat(Bowl bowl) {
        if (bowl.feedCat(5)) {
            isFull = true;
        }
    }
    public boolean isFull() {
        return isFull;
    }
}