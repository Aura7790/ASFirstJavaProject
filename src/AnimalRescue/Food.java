package AnimalRescue;

public abstract class Food {
    private String foodName;
    private double foodPrice;
    private int foodQty;
    private boolean foodAvailability;

    public Food(String foodName, double foodPrice, int foodQty, boolean foodAvailability){
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.foodQty = foodQty;
        this.foodAvailability = foodAvailability;
    }
    public String getFoodName() {
        return foodName;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public int getFoodQty() {
        return foodQty;
    }

    public boolean getFoodAvailability() {
        return foodAvailability;
    }

    public double getTotalCost() {
        return foodPrice * foodQty;
    }

    public abstract void describeAnimalFood();
}
