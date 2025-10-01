package AnimalRescue;

public class FamilyAdopter extends Adopter{
    public FamilyAdopter(String adopterName, int adopterAvailableMoney) {
        super(adopterName, adopterAvailableMoney);
    }

    @Override
    public void adoptAnimal(String animalName){
        System.out.println(getAdopterName() + " and his family have the amount of " + getAdopterAvailableMoney() + " dollars to adopt " + animalName + ".");
    }
}
