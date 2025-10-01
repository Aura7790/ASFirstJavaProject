package AnimalRescue;

public class Dog extends Animal{
    Dog(String name) {
        super(name);
    }
    public void tailWagging(){
        System.out.println(getAnimalName() + " is wagging the tail!");
    }
    public void bite(){
        System.out.println(getAnimalName() + " bites bad ppl!");
    }

    @Override
    public void eat() {
        System.out.println(getAnimalName() + " is eating dry and wet dog food!");
    }

    @Override
    public void sleep() {
        System.out.println(getAnimalName() + " is sleeping ZZZZZZzzzzzz!");
    }

    @Override
    public void speak() {
        System.out.println(getAnimalName() + " Woof woof!");
    }

    @Override
    public void run() {
        System.out.println(getAnimalName() + " Dog is running!!");
    }
}
