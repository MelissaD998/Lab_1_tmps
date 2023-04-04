package abstractFactory.concreteProduct;

import abstractFactory.abstractProduct.Cake;

public class ChocolateCake implements Cake { //concrete product
    @Override
    public void showIngredients() {
        System.out.println("Ingredients for Chocolate Cake: ");
        System.out.println("blat de cacao, crema de mascarpone, ciocolata");
    }
}
