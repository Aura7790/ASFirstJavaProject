package AnimalRescue;

public class Elephant extends Animal{
    @Override
    public void eat() {
        System.out.println("Elephants eat fruits!");
    }

    @Override
    public void run() {
        System.out.println("Elephant is running!");
    }
}
