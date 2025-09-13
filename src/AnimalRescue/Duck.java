package AnimalRescue;

public class Duck extends Animal{
    @Override
    public void eat() {
        System.out.println("Duck food: Corn, seeds, grass & loves water!");
    }

    @Override
    public void speak() {
        System.out.println("Mac Mac!");
    }

    @Override
    public void run() {
        System.out.println("Duck is flying!!");
    }
}
