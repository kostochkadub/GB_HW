package Animal;

public class Plate {

    private int food;
    private boolean lowFoodInTable;

    public int getFood() {
        return food;
    }

    public boolean isLowFoodInTable() {
        return lowFoodInTable;
    }

    public Plate(int food) {
        this.food = food;
        this.lowFoodInTable = false;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void decreaseFood(int appetite) {
        if(food-appetite<0)
        {
            System.out.println("В тарелке нет столько еды");
            lowFoodInTable = true;
        }
       else {food -= appetite;}
    }

    public void addFood(int n){
        food += n;
        lowFoodInTable = false;
    }


}
