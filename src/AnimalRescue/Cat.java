package AnimalRescue;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("Eats only Cat food");
    }

    public void purr() {
        System.out.println("Purrrrr!");
    }

    @Override
    public void run() {
        System.out.println("Cats have their own speed!");
    }
}
