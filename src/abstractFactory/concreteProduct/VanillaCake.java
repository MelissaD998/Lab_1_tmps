package abstractFactory.concreteProduct;

import abstractFactory.abstractProduct.Cake;

public class VanillaCake implements Cake {
    @Override
    public void showIngredients() {
        System.out.println("Ingredients for Vanilla Cake: ");
        System.out.println("blat de vanilie, crema de vanilie, fructe de padure");
    }
}
