package AnimalRescue;

public class PetVet extends Vet{
    public PetVet(String vetName, String vetSpecialty) {
        super(vetName, vetSpecialty);
    }

    @Override
    public void treatAnimal(String animalName) {
        System.out.println(getVetName() + " is examining my pet: " + animalName + ". For sure is something that ate last night.");
    }
}
