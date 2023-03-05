

public class Bear extends Animal {
    public Bear(String name, String color) {
        super(name, color,4);
    }

    public Bear(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("РРРРРР!");
    }

    public void fly() {
        System.out.println("Медведи не летают!!");
    }
}