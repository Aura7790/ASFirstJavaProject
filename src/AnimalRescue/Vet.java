package AnimalRescue;

public abstract class Vet {
    private String vetName;
    private String vetSpecialty;

    public Vet(String vetName, String vetSpecialty){
        this.vetName = vetName;
        this.vetSpecialty = vetSpecialty;
    }

    public String getVetName() {
        return vetName;
    }

    public String getVetSpecialty() {
        return vetSpecialty;
    }

    public abstract void treatAnimal(String animalName);
}