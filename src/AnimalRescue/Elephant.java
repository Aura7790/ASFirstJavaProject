package AnimalRescue;

public class Elephant extends Animal{
    Elephant(String animalName) {
        super(animalName);
    }

    @Override
    public void eat() {
        System.out.println(getAnimalName() + " elephant eat fruits!");
    }

    @Override
    public void sleep() {
        System.out.println(getAnimalName()+ " Elephant is sleeping!");
    }

    @Override
    public void speak() {
        System.out.println(getAnimalName() + " says: Trumpet!");
    }

    @Override
    public void run() {
        System.out.println(getAnimalName() + " is running heavily!");
    }

    public void sprayWater() {
        System.out.println(getAnimalName() + " is spraying water with its trunk.");
    }
}
