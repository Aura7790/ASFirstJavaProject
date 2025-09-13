package AnimalRescue;

public class Dog extends Animal{
    public void tailWagging(){
        System.out.println("Wagging the tail!");
    }
    public void bite(){
        System.out.println("They bite bad ppl!");
    }

    @Override
    public void eat() {
        System.out.println("Dogs eat dog food only!");
    }

    @Override
    public void sleep() {
        System.out.println("ZZZZZZzzzzzz!");
    }

    @Override
    public void speak() {
        System.out.println("Woof woof!");
    }

    @Override
    public void run() {
        System.out.println("Dog is running!!");
    }
}
