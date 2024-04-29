package springproject.jobschedule.model;

public class InventoryItem {
    // Represents an item in the inventory, including fields like item ID, description, quantity, location within the warehouse, etc.
    // Fields include item ID, description, quantity, location within the warehouse, etc.
    // ID would be the unique identifier for the item, it would be an integer.
    private int id;
    private String description;
    private int quantity;
    private String location;
    public InventoryItem(int id, String description, int quantity, String location) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.location = location;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
}
