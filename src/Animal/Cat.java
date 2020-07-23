package Animal;

public class Cat extends Animal {

    private int appetite;
    private int satiety;
    private boolean isFull;

    public boolean isFull() {
        return isFull;
    }

    public int getAppetite() {
        return appetite;
    }

    public int getSatiety() {
        return satiety;
    }

    public Cat(String name, int appetite, int satiety) {
        super(name);
        this.appetite = appetite;
        this.satiety = satiety;
        this.isFull = false;
    }

    public Cat(String name) {
        super(name);
        this.name=name;
        this.maxJump=2;
        this.maxRun=200;
    }


    public void eat(Plate p) {
        if(satiety>0) {
            p.decreaseFood(appetite); //Вычесть еду из тарелки
            if(!p.isLowFoodInTable()){ //Если еды хватает, то можно уталить жажду(сытость) кота на уровень аппетита
                satiety -= appetite;
            }
        }
        else {
            System.out.println("Кошка " + name + " уже сыта!");
            isFull=true;
        }
    }

    @Override
    public void swim(int length) {
        System.out.println("Кошки не плавают!");
    }
}
