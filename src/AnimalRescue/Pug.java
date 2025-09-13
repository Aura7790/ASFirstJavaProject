package AnimalRescue;

public class Pug extends Dog{
    public void snore(){
        System.out.println("snores");
    }

    @Override
    public void speak() {
        System.out.println("oink oink");
    }
}
