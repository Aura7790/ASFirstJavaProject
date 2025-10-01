package AnimalRescue;

public class WetMeatFood extends MeatFood{
    public WetMeatFood(String foodName, double foodPrice, int foodQty, boolean foodAvailability) {
        super(foodName, foodPrice, foodQty, foodAvailability);
    }

    @Override
    public void describeAnimalFood() {
        String status = getFoodAvailability() ? "Available" : "Not Available";
        System.out.println(getFoodName() + " (Wet Meat) - " + status +
                ". Quantity: " + getFoodQty() + " kg. Total Cost: $" + getTotalCost());
    }
}
