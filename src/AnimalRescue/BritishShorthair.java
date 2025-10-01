package AnimalRescue;

public class BritishShorthair extends Cat{
    BritishShorthair(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getAnimalName() + " Meoooow!");
    }
}
