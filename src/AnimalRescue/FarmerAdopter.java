package AnimalRescue;

public class FarmerAdopter extends Adopter{
    public FarmerAdopter(String adopterName, int adopterAvailableMoney) {
        super(adopterName, adopterAvailableMoney);
    }

    @Override
    public void adoptAnimal(String animalName){
        System.out.println(getAdopterName() + " adopted " + animalName + " for the farm. He payed the sum of: " + getAdopterAvailableMoney() + " dollars.");
    }
}
