package AnimalRescue;

public abstract class Cat extends Animal{
    Cat(String name) {
        super(name);
    }
    @Override
    public void eat() {
        System.out.println(getAnimalName() + " Eats only Cat food");
    }

    @Override
    public void sleep() {
        System.out.println(getAnimalName() + " Cat sleeping");
    }

    @Override
    public void run() {
        System.out.println(getAnimalName() + " Running... Cats have their own speed!");
    }

    public void purr() {
        System.out.println(getAnimalName() + " Purrrrr!");
    }
}
