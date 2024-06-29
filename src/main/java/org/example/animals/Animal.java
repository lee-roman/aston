package org.example.animals;



public abstract class Animal {
    protected String name;
    protected int runLimit;
    protected int swimLimit;
    protected static int count;

    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        count++;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

    public static int getCount() {
        return count;
    }
}
