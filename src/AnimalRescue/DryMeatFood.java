package AnimalRescue;

public class DryMeatFood extends MeatFood {
    public DryMeatFood(String foodName, double foodPrice, int foodQty, boolean foodAvailability) {
        super(foodName, foodPrice, foodQty, foodAvailability);
    }

    @Override
    public void describeAnimalFood() {
        String status = getFoodAvailability() ? "Available" : "Not Available";
        System.out.println(getFoodName() + " (Dry Meat) - " + status +
                ". Quantity: " + getFoodQty() + " kg. Total Cost: $" + getTotalCost());
    }
}
