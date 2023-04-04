package abstractFactory.concreteProduct;

import abstractFactory.abstractProduct.Cake;
public class VelvetCake implements Cake{
    @Override
    public void showIngredients() {
        System.out.println("Ingredients for Velvet Cake: ");
        System.out.println("blat de vanilie, colorant rosu, crema de branza");
    }
}
