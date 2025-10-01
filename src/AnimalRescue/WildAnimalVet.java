package AnimalRescue;

public class WildAnimalVet extends Vet{
    public WildAnimalVet(String vetName, String vetSpecialty) {
        super(vetName, vetSpecialty);
    }

    @Override
    public void treatAnimal(String animalName) {
        System.out.println(getVetName() + " is examining: " + animalName + ". After this, it will be released in the wild.");
    }
}
