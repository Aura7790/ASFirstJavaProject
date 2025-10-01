package AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        // Using a Pug
        Pug pug = new Pug("Snorty");
        pug.sleep();
        pug.eat();
        pug.bite();
        pug.tailWagging();
        if (pug instanceof Pug){
            pug.snore();
            pug.speak();
        }

        // Using an Elephant
        Animal myElephant = new Elephant("Dumbo");
        myElephant.run();
        myElephant.speak();
        if (myElephant instanceof Elephant){
            ((Elephant) myElephant).sprayWater();
        }

        // Animal Activities
        Activities foxActivity = new FoxActivity("Foxy");
        foxActivity.performActivity();
        Activities dogActivity = new DogActivity("Max");
        dogActivity.performActivity();
        Activities catActivity = new CatActivity("Garfield");
        catActivity.performActivity();

        // Adopter
        Adopter family = new FamilyAdopter("Mihai", 100);
        family.adoptAnimal("Kitty");
        Adopter farmer = new FarmerAdopter("John", 50);
        farmer.adoptAnimal("Max");
        Adopter zoo = new ZooAdopter("Mara", 0);
        zoo.adoptAnimal("Foxy");

        // Food
        Food fruits = new FruitsFood("Apple", 5.59, 2, true);
        fruits.describeAnimalFood();
        Food grass = new GrassFood("Hay", 9.99, 5, false);
        grass.describeAnimalFood();
        Food dryMeat = new DryMeatFood("Beef Jerky", 6.50, 5, true);
        dryMeat.describeAnimalFood();
        Food wetMeat = new WetMeatFood("Canned Chicken", 4.75, 3, true);
        wetMeat.describeAnimalFood();

        // Vet
        Vet exoticVet = new ExoticAnimalsVet("Maria", "Exotic animals");
        exoticVet.treatAnimal("Dumbo");
        Vet largeAnimals = new LargeAnimalsVet("Johanna", "Cardiologist");
        largeAnimals.treatAnimal("Giffy");
        Vet petVet = new PetVet("Matei", "Nutritionist");
        petVet.treatAnimal("Garfield");
        Vet smallAnimals = new SmallAnimalsVet("Andrei", "Small animals specialist");
        smallAnimals.treatAnimal("Pigeon");
        Vet wildsAnimals = new WildAnimalVet("George", "Wild animals specialist");
        wildsAnimals.treatAnimal("Bruno The Bear");
    }
}
