

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(null, null, 1);
//        System.out.println(animal.getColor());

        Animal animal1 = new Animal("влоы");
//        System.out.println(animal1.getPawsCount());
        Object animal3 = new Animal();

    //    Cat cat1 = new Cat("Мурзик");
    //    System.out.println(animal1.getType());
    //    System.out.println(cat1.getType());

        Cat cat2 = new Cat("Котик", "Белый");
        // cat2.speak();


        Dog dog2 = new Dog("Чаппи"); 

        Bear bear = new Bear("Гризли");
        

        List<Animal> animals = new ArrayList<>();
        animals.add(cat2);
        animals.add(new Dog("Бобик", "Черный"));
        animals.add(new Duck("Дональд", "Разноцветный"));

        // animals.forEach(Animal::speak);

    //    for (Animal a: animals) {
    //        System.out.println(a);
    //        if(a instanceof Duck) ((Duck) a).fly();
    //    }

        cat2.hunt();
        cat2.fly();
        cat2.swim();
        dog2.toGo();
        dog2.fly();
        bear.fly();


        
    }
}