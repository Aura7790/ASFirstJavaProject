package AnimalRescue;

public class Food {
    private String foodName;
    private double foodPrice;
    private int foodQty;
    private boolean foodAvailability;

    // Getters
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

    // Setters

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public void setFoodQty(int foodQty) {
        this.foodQty = foodQty;
    }

    public void setFoodAvailability(boolean foodAvailability) {
        this.foodAvailability = foodAvailability;
    }
}
