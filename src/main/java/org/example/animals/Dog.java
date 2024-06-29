package org.example.animals;



public class Dog extends Animal {
    private static int dogCount;

    public Dog(String name) {
        super(name, 500, 10);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м., превышено ограничение в " + runLimit + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= swimLimit) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " м., превышено ограничение в " + swimLimit + " м.");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}
