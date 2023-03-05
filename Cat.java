

public class Cat extends Animal {
    public Cat(String name, String color) {
        super(name, color,4);
    }

    public Cat(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Мяу!");
    }

    public void hunt() {
        wakeUp();
        findFood();
        eat();
    }

    private void wakeUp() {
        System.out.println("Котик проснулся..");
    }

    private void findFood() {
        System.out.println("Котик ищет еду..");
    }

    private void eat() {
        System.out.println("Котик ест..");
    }

    public void toPlay() {
        System.out.println("Котик играет..");
    }

    public void goToSleep() {
        System.out.println("Котик готов спать..");
    }

    public void fly() {
        System.out.println("Кошки не летают!!");
    }

    public void swim() {
        System.out.println("Кошки не плавают!!");
    }

    
}