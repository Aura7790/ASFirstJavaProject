package AnimalRescue;

public class SmallAnimalsVet extends Vet{
    public SmallAnimalsVet(String vetName, String vetSpecialty) {
        super(vetName, vetSpecialty);
    }

    @Override
    public void treatAnimal(String animalName) {
        System.out.println(getVetName() + " is taking care of my small bird: " + animalName);
    }
}
