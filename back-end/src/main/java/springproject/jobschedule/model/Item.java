package springproject.jobschedule.model;

public class Item {
    private int id;
    private String description;
    private int quantity;
    private String location;
    private int price;
    private String category;
    private String imageURL;
    
    public Item(int id, String description, int quantity, String location, int price, String category,
            String imageURL) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.location = location;
        this.price = price;
        this.category = category;
        this.imageURL = imageURL;
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
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getImageURL() {
        return imageURL;
    }
    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
