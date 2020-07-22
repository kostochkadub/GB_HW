package Animal;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Барсик");
        Dog dog = new Dog("Бобик");

        cat.jump(1);
        cat.jump(2);
        cat.jump(3);

        cat.run(199);
        cat.run(200);
        cat.run(201);

        cat.swim(0);
        cat.swim(2);

        dog.jump(0.49);
        dog.jump(0.5);
        dog.jump(0.51);

        dog.run(499);
        dog.run(500);
        dog.run(501);

        dog.swim(9);
        dog.swim(10);
        dog.swim(11);
    }


}
