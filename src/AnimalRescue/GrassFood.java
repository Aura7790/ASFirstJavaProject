package AnimalRescue;

public class GrassFood extends Food{
    public GrassFood(String foodName, double foodPrice, int foodQty, boolean foodAvailability) {
        super(foodName, foodPrice, foodQty, foodAvailability);
    }

    @Override
    public void describeAnimalFood(){
        String status = getFoodAvailability() ? "Available" : "Not Available";
        System.out.println(getFoodName() + " (Grass) - " + status +
                ". Quantity: " + getFoodQty() + " kg. Total Cost: $" + getTotalCost());
    }
}
