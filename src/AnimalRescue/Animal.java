package AnimalRescue;

public class Animal {
    private String animalName;
    private int animalAge;
    private int animalHealthLevel; // from 1 to 10
    private int animalHungerLevel; // from 1 to 10
    private int animalSpiritState; // from 1 to 10
    private String animalFavouriteFood;
    private String animalFavouriteActivity;

    // Getters

    public String getAnimalName() {
        return animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public int getAnimalHealthLevel() {
        return animalHealthLevel;
    }

    public int getAnimalHungerLevel() {
        return animalHungerLevel;
    }

    public int getAnimalSpiritState() {
        return animalSpiritState;
    }

    public String getAnimalFavouriteFood(){
        return animalFavouriteFood;
    }

    public String getAnimalFavouriteActivity(){
        return animalFavouriteActivity;
    }

    // Setters
    public void setAnimalName(String animalName){
        this.animalName = animalName;
    }

    public void setAnimalAge(int animalAge){
        this.animalAge = animalAge;
    }

    public void setAnimalHealthLevel(int animalHealthLevel){
        this.animalHealthLevel = animalHealthLevel;    // from 1 to 10
    }

    public void setAnimalHungerLevel(int animalHungerLevel){
        this.animalHungerLevel = animalHungerLevel;    // from 1 to 10
    }

    public void setAnimalSpiritState(int animalSpiritState){
        this.animalSpiritState = animalSpiritState;    // from 1 to 10
    }

    public void setAnimalFavouriteFood(String animalFavouriteFood){
        this.animalFavouriteFood = animalFavouriteFood;
    }

    public void setAnimalFavouriteActivity(String animalFavouriteActivity){
        this.animalFavouriteActivity = animalFavouriteActivity;
    }

    public void eat() {

    }

    public void sleep(){

    }

    public void speak() {

    }

    public void run() {

    }
}
