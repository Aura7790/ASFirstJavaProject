package AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        Animal rescuedAnimal = new Animal();
        System.out.println("The animal's name is: " + rescuedAnimal.animalName);
        System.out.println("The animal's age is: " + rescuedAnimal.animalAge);
        System.out.println("The animal's health level is: " + rescuedAnimal.animalHealthLevel);
        System.out.println("The animal's hunger level is: " + rescuedAnimal.animalHungerLevel);
        System.out.println("The animal's spirit state is: " + rescuedAnimal.animalSpiritState);
        System.out.println("The animal's favourite food is: " + rescuedAnimal.animalFavouriteFood);
        System.out.println("The animal's favourite activity is: " + rescuedAnimal.animalFavouriteActivity);

        Adopter adopter = new Adopter();
        System.out.println("The adopter's name is: " + adopter.adopterName);
        System.out.println("The adopter's available amount is is: " + adopter.adopterAvailableMoney + " $");

        Food animalFood = new Food();
        System.out.println("The food name is: " + animalFood.foodName);
        System.out.println("The food price is: " + animalFood.foodPrice + " $");
        System.out.println("The food quantity is: " + animalFood.foodQty + " kg");
        System.out.println("The food availability is: " + animalFood.foodAvailability);

        Activities animalActivity = new Activities();
        System.out.println("The animal activity is: " + animalActivity.activityName);

        Vet animalVet = new Vet();
        System.out.println("The vet name is: " + animalVet.vetName);
        System.out.println("The vet specialty is: " + animalVet.vetSpecialty);

        // Dog rudolph = new Dog();
        // attributes Dog
        // System.out.println("The dog's name is: " + rudolph.name);
        // System.out.println("The dog's age is: " + rudolph.age + " years");
        // rudolph.age = 6; // suprascrierea atributelor
        // System.out.println("The dog's age is: " + rudolph.age + " years");
        // System.out.println("The dog's weight is: " + rudolph.weight + " kilograms");

        // behaviours Dog
        // rudolph.tailWagging();
        // rudolph.sleep();
        // rudolph.eat();
        // rudolph.run();
    }
}
