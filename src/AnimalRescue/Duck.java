package AnimalRescue;

public class Duck extends Animal{
    Duck(String name) {
        super(name);
    }
    @Override
    public void eat() {
        System.out.println(getAnimalName() + " Duck food: Corn, seeds, grass & loves water!");
    }

    @Override
    public void sleep() {
        System.out.println(getAnimalName() + " Duck is sleeping!");
    }

    @Override
    public void speak() {
        System.out.println(getAnimalName() + " Mac Mac!");
    }

    @Override
    public void run() {
        System.out.println("Duck is flying!!");
    }
}
