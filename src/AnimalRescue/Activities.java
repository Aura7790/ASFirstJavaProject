package AnimalRescue;

public abstract class Activities {
    private String animalName;

    public Activities(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalName(){
        return animalName;
    }

    public abstract void performActivity();
}
