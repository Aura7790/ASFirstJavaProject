package AnimalRescue;

public class ExoticAnimalsVet extends Vet{
    public ExoticAnimalsVet(String vetName, String vetSpecialty) {
        super(vetName, vetSpecialty);
    }

    @Override
    public void treatAnimal(String animalName) {
        System.out.println(getVetName() + " is treating this elephant named: " + animalName);
    }
}
