package Animal;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
        this.name=name;
        this.maxJump=0.5;
        this.maxRun=500;
        this.maxSwim=10;
    }
}
