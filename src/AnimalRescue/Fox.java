package AnimalRescue;

public class Fox extends Animal{
    @Override
    public void eat() {
        System.out.println("Fox Fod only and some fresh meat!");
    }

    @Override
    public void run() {
        System.out.println("Fox is running!");
    }
}
