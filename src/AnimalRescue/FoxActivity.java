package AnimalRescue;

public class FoxActivity extends Activities{
    public FoxActivity(String animalName) {
        super(animalName);
    }

    @Override
    public void performActivity() {
        System.out.println(getAnimalName() + " is sneaking through the forest.");
    }
}
