package abstractFactory.concreteProduct;

import abstractFactory.abstractProduct.Cake;

public class StrawberryCake implements Cake {
    @Override
    public void showIngredients() {
        System.out.println("ok");
    }
}
