package AnimalRescue;

public class ZooAdopter extends Adopter{
    public ZooAdopter(String adopterName, int adopterAvailableMoney) {
        super(adopterName, adopterAvailableMoney);
    }

    @Override
    public void adoptAnimal(String animalName){
        System.out.println(getAdopterName() + " the zookeeper adopted " + animalName + " for the zoo.");
    }
}
