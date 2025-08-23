package AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        Animal rescuedAnimal = new Animal();
        rescuedAnimal.setAnimalName("Max");
        System.out.println("The animal name is: " + rescuedAnimal.getAnimalName());
        rescuedAnimal.setAnimalAge(3);
        System.out.println("The animal age is: " + rescuedAnimal.getAnimalAge());
        rescuedAnimal.setAnimalHealthLevel(9);
        System.out.println("The animal health level is: " + rescuedAnimal.getAnimalHealthLevel());
        rescuedAnimal.setAnimalHungerLevel(6);
        System.out.println("The animal hunger level is: " + rescuedAnimal.getAnimalHungerLevel());
        rescuedAnimal.setAnimalSpiritState(9);
        System.out.println("The animal spirit state is: " + rescuedAnimal.getAnimalSpiritState());
        rescuedAnimal.setAnimalFavouriteFood("meat");
        System.out.println("The animal favourite food is: " + rescuedAnimal.getAnimalFavouriteFood());
        rescuedAnimal.setAnimalFavouriteActivity("running");
        System.out.println("The animal favourite activity is: " + rescuedAnimal.getAnimalFavouriteActivity());

        Adopter adopter = new Adopter();
        adopter.setAdopterName("Maria");
        System.out.println("The adopter's name is: " + adopter.getAdopterName());
        adopter.setAdopterAvailableMoney(1000);
        System.out.println("The adopter's available amount is is: " + adopter.getAdopterAvailableMoney() + "Euro");

        Food animalFood = new Food();
        animalFood.setFoodName("Pedigree");
        System.out.println("The food name is: " + animalFood.getFoodName());
        animalFood.setFoodPrice(20);
        System.out.println("The food price is: " + animalFood.getFoodPrice() + " Euro");
        animalFood.setFoodQty(2);
        System.out.println("The food quantity is: " + animalFood.getFoodQty() + " kg");
        animalFood.setFoodAvailability(true);
        System.out.println("The food availability is: " + animalFood.getFoodAvailability());

        Activities animalActivity = new Activities();
        animalActivity.setActivityName("Running");
        System.out.println("The animal activity is: " + animalActivity.getActivityName());

        Vet animalVet = new Vet();
        animalVet.setVetName("Marian Popescu");
        System.out.println("The vet name is: " + animalVet.getVetName());
        animalVet.setVetSpecialty("Nutrition");
        System.out.println("The vet specialty is: " + animalVet.getVetSpecialty());

        // Some examples for Inheritance Homework
        Dog max = new Dog();
        max.setAnimalName("Max");
        max.setAnimalAge(3);
        System.out.println(max.getAnimalName());
        System.out.println(max.getAnimalAge());

        Cat myCat = new Cat();
        myCat.setAnimalName("Tom");
        myCat.setAnimalHungerLevel(5);
        System.out.println(myCat.getAnimalName());
        System.out.println("The cat hunger level is: " + myCat.getAnimalHungerLevel());

        Fox myFox = new Fox();
        myFox.setAnimalName("Foxy");
        myFox.setAnimalFavouriteActivity("hunting");
        System.out.println(myFox.getAnimalName());
        System.out.println("Foxy's favourite activity is: " + myFox.getAnimalFavouriteActivity());

        FruitsFood fruit = new FruitsFood();
        fruit.setFoodName("Apple");
        System.out.println(fruit.getFoodName());
    }
}
