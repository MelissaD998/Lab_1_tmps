package abstractFactory.client;

import abstractFactory.abstractProduct.Cake;
import abstractFactory.abstractFactory.CakeFactory;

public class Miro {

    private CakeFactory cakefactory;
//principal methods
    public Miro(CakeFactory cakeFactory) {
        this.cakefactory = cakeFactory;
    }
    //uses AbstractFactory interface to create objects from related family of products
    public void cakeIngredients() {
        Cake cake = cakefactory.createCake();
        cake.showIngredients();
    }

    public void orderCake(String choice) {
        Cake cake = cakefactory.createCake();
        if (choice.equals("yes")) {
            System.out.println("Cake ordered: " + cake.getClass().getSimpleName() + "\n");
        } else {
            System.out.println("Cake not ordered\n");
        }
    }
}
