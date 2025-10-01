package AnimalRescue;

public abstract class Adopter {
    private String adopterName;
    private int adopterAvailableMoney;

    public Adopter(String adopterName, int adopterAvailableMoney){
        this.adopterName = adopterName;
        this.adopterAvailableMoney = adopterAvailableMoney;
    }

    public String getAdopterName(){
        return adopterName;
    }

    public int getAdopterAvailableMoney(){
        return adopterAvailableMoney;
    }

    public abstract void adoptAnimal(String animalName);

}
