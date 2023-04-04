package factoryMethod.concreteCreator;

import factoryMethod.concreteProduct.StrawberryCupcake;
import factoryMethod.creator.CupcakeFactory;
import factoryMethod.product.Cupcake;

public class StrawberryCupcakeFactory implements CupcakeFactory {
    @Override
    public Cupcake createCupcake(String type, String frosting, int temperature, int time) {
        return new StrawberryCupcake(type, frosting, temperature, time);
    }
}
