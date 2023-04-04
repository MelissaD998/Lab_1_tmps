package singletonBuilder;

import java.util.ArrayList;
import java.util.List;

public class GroceryManager {
    private static GroceryManager instance;
    private List<Product> products;

    private GroceryManager() {
        this.products = new ArrayList<>();
    }

    public static GroceryManager getInstance() {  //obtains the singleton instance of the GroceryManager class.
        if (instance == null) {
            instance = new GroceryManager();  // the instance of the obj Grocerymanager is created only when is called the method getinstance().
        }
        return instance;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }
}



