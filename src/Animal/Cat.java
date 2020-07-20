package Animal;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
        this.name=name;
        this.maxJump=2;
        this.maxRun=200;
    }

    @Override
    public void swim(int length) {
        System.out.println("Кошки не плавают!");
    }
}
