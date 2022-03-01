/**
 *Java 1. Homework #6.
 *
 * @author Grave Elizaveta
 * @version 01.03.2022
 *
 */

class Extending {

    public static void main(String[]args) {
        Cat cat = new Cat(200);
        Dog dog = new Dog (500, 10);

        IAnimal[] animals = {cat, dog};
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(100));
            System.out.println(animal.run(550));
            System.out.println(animal.swim(5));
            System.out.println(animal.swim(20));
        }
    }
}
class Cat extends Animal {
    Cat(int run_Limit) {
        super(run_Limit, 0);
    }

    @ Override
    public String swim(int distance) {
        return getClassName() + " can't swim";
    }
}

class Dog extends Animal {
    Dog(int run_Limit, int swim_Limit) {
        super(run_Limit, swim_Limit);
    }
}

abstract class Animal implements IAnimal{
    protected int run_Limit;
    protected int swim_Limit;
    protected String className;
    

    Animal(int run_Limit, int swim_Limit) {
        this.run_Limit = run_Limit;
        this.swim_Limit = swim_Limit;
        className = getClass().getSimpleName();
    }

    public String getClassName() {
        return className;
    }

    @Override
    public String run(int distance) {
        if (distance > run_Limit) {
            return className + " can't run " + distance + " metre";
        } else {
            return className + " can run " + distance + " metre";
        }
    }

    @Override
    public String swim(int distance) {
        if (distance > swim_Limit) {
            return className + " can't swim " + distance + " metre";
        } else {
            return className + " can swim " + distance + " metre";
        }
    }

    @Override
    public String toString() {
        return className + " run_Limit: " + run_Limit + " swim_Limit: " + swim_Limit;
    }
}

interface IAnimal {
    String run(int distance);
    String swim(int distance);
}