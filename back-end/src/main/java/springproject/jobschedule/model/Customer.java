package springproject.jobschedule.model;

import java.util.List;

public class Customer {
    // This would have all the details about the customer, such as name, address, phone number, etc along with with all the orders placed by the customer.

    private int id;
    private String name;
    private String address;
    private String phoneNumber;
    private List<Order> orders;
    public Customer(int id, String name, String address, String phoneNumber, List<Order> orders) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.orders = orders;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public List<Order> getOrders() {
        return orders;
    }
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
