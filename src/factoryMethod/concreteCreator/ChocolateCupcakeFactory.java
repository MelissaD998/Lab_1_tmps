package factoryMethod.concreteCreator;

import factoryMethod.concreteProduct.ChocolateCupcake;
import factoryMethod.creator.CupcakeFactory;
import factoryMethod.product.Cupcake;

public class ChocolateCupcakeFactory implements CupcakeFactory {  //concrete creator class
    @Override
    public Cupcake createCupcake(String type, String frosting, int temperature, int time) {
        return new ChocolateCupcake(type, frosting, temperature, time); //return a product
    } //gets various parameters for baking a cupcake and returns a concrete Cupcake obj.
}
