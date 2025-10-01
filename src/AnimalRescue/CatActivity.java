package AnimalRescue;

public class CatActivity extends Activities{
    public CatActivity(String animalName) {
        super(animalName);
    }

    @Override
    public void performActivity(){
        System.out.println(getAnimalName() + " is eating lasagna.");
    }
}
