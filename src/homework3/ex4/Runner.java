package homework3.ex4;

public class Runner {
    public static void main(String[] args) {
        Ruller<Animal> animalRuller = (animal) -> animal.getBodyLength() + animal.getTailLength();
        Ruller<Boat> boatRuller = (boat) -> boat.getBoatLength();

        System.out.println(animalRuller.measures(new Animal(15, 7.5)));
        System.out.println(boatRuller.measures(new Boat(3600)));
    }
}
