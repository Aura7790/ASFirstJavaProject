package AnimalRescue;

public class Fox extends Animal{
    public Fox(String animalName) {
        super(animalName);
    }

    @Override
    public void eat() {
        System.out.println(getAnimalName() + " Fox Fod only and some fresh meat!");
    }

    @Override
    public void sleep() {
        System.out.println(getAnimalName() + " Fox is sleeping");
    }

    @Override
    public void speak() {
        System.out.println(getAnimalName() + " Fox is speaking");
    }

    @Override
    public void run() {
        System.out.println(getAnimalName() + " Fox is running!");
    }
}
