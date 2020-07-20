package Animal;

public class Animal {
    protected String name;
    protected int maxRun;
    protected double maxJump;
    protected int maxSwim;


    public Animal(String name) {
        this.name = name;
    }

    public void jump(double length) {
        if(length <= maxJump){
        System.out.println("Животное "+name+" подпрыгнуло на "+length+" метров");
        }
        else System.out.println("Животное " +name+  " не может так прыгать на "+length+" метров");
    }

    public void run(int length) {
        if(length <= maxRun){
        System.out.println("Животное "+name+" бежит "+length+" м");
        }
        else System.out.println("Животное "+name+" не может так бегать на "+length+" метров");
    }

    public void swim(int length) {
        if (length <= maxSwim){
            System.out.println("Животное "+name+" плывет "+length+" м");
        }
        else System.out.println("Животное "+name+" не может плыть "+length+" м");
    }

}
