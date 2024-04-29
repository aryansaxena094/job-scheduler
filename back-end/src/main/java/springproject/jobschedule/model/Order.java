package springproject.jobschedule.model;

import java.util.Date;
import java.util.List;

public class Order {
    // Represents an order, containing fields such as order ID, list of items, status, priority, and customer details.
    // Fields include order ID, list of items, status, priority, and customer details.
    // ID would be the unique identifier for the order, it would be an integer.
    private int id;
    private List<InventoryItem> items;
    private Date orderDate;
    private Date estimatedDeliveryTime;
    private String status;
    private int priority;
    private Customer customer;
    public Order(int id, List<InventoryItem> items, Date orderDate, Date estimatedDeliveryTime, String status, int priority, Customer customer) {
        this.id = id;
        this.items = items;
        this.orderDate = orderDate;
        this.estimatedDeliveryTime = estimatedDeliveryTime;
        this.status = status;
        this.priority = priority;
        this.customer = customer;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public List<InventoryItem> getItems() {
        return items;
    }
    public void setItems(List<InventoryItem> items) {
        this.items = items;
    }
    public Date getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    public Date getEstimatedDeliveryTime() {
        return estimatedDeliveryTime;
    }
    public void setEstimatedDeliveryTime(Date estimatedDeliveryTime) {
        this.estimatedDeliveryTime = estimatedDeliveryTime;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public int getPriority() {
        return priority;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
