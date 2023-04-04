package factoryMethod.creator;

import factoryMethod.product.Cupcake;

public interface CupcakeFactory { //default implementation of the factory method
    Cupcake createCupcake(String type, String frosting, int temperature, int time);
}
