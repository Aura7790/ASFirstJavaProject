package AnimalRescue;

public class Pug extends Dog{
    Pug(String name) {
        super(name);
    }
    @Override
    public void eat(){
        System.out.println(getAnimalName() + " prefers dry dog food!");
    }

    public void snore(){
        System.out.println(getAnimalName() + " is snoring loudly :)");
    }

    @Override
    public void speak() {
        System.out.println(getAnimalName() + " says: Snort-snort!");
    }
}
