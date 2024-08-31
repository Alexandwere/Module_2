package homewokr1.ex1;

import homewokr1.ex1.animal.Animal;
import homewokr1.ex1.animal.Bird;
import homewokr1.ex1.animal.Dog;
import homewokr1.ex1.animal.Tiger;

public class Runner {
    public static void main(String[] args) {
        Zoo<Tiger, Dog, Bird> zoo = new Zoo<>(new Tiger(), new Dog(), new Bird());

        zoo.getAnimal1().speak();
        zoo.getAnimal2().speak();
        zoo.getAnimal3().speak();
    }
}
