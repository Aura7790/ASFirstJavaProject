package AnimalRescue;

public class LargeAnimalsVet extends Vet{
    public LargeAnimalsVet(String vetName, String vetSpecialty) {
        super(vetName, vetSpecialty);
    }

    @Override
    public void treatAnimal(String animalName) {
        System.out.println(getVetName() + " is handling this giraffe: " + animalName);
    }
}
