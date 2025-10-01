package AnimalRescue;

public class DogActivity extends Activities{
    public DogActivity(String animalName) {
        super(animalName);
    }

    @Override
    public void performActivity(){
        System.out.println(getAnimalName() + " is fetching a stick.");
    }
}
