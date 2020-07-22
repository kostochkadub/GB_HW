package Animal;

public class Main {

    public static void main(String[] args) {
        Cat[] cat = new Cat[5];

        Dog dog = new Dog("Бобик");

        Plate plate = new Plate(100);

        cat[0] = new Cat("Kitty", 5,10);
        cat[1] = new Cat("Molly", 7,15);
        cat[2] = new Cat("Lily", 8,20);
        cat[3] = new Cat("Barsik", 9,25);
        cat[4] = new Cat("Unio", 7,50);


        for (int i =0; i < cat.length; i++){
            while (!cat[i].isFull()) {
                cat[i].eat(plate);
                plate.info();
                if(plate.isLowFoodInTable())
                {
                    System.out.println("Добавим еще 50 еды!");//Всегда добавляем в тарелку еду, если ее не хватает
                    plate.addFood(50);
                    //Если нужен вывод, что еды в тарелке больше нет и нужно остановиться, то тут прописать break;
                }
            }
        }





        dog.jump(0.49);

        dog.run(499);

        dog.swim(9);
    }


}
