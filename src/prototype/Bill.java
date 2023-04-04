package prototype;

import java.util.ArrayList;
import java.util.List;

public class Bill implements Cloneable {  //concrete prototype
    private int id;
    private Customer customer;
    private List<String> products;
    private double total;
//capable to create a copy of self objects
    public Bill(int id, Customer customer, List<String> products, double total) {
        this.id = id;
        this.customer = customer;
        this.products = products;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    private void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<String> getProducts() {
        return products;
    }

    private void setProducts(List<String> products) {
        this.products = products;
    }

    public double getTotal() {
        return total;
    }

    private void setTotal(double total) {
        this.total = total;
    }

    @Override
    public Bill clone() throws CloneNotSupportedException {
        Bill bill = (Bill) super.clone();
        bill.customer = customer.clone();
        bill.products = new ArrayList<>();
        bill.total = total;
        bill.products.addAll(products);
        return bill;
    }
}