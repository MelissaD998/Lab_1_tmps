package factoryMethod;

import factoryMethod.creator.CupcakeFactory;
import factoryMethod.product.Cupcake;

public class CupcakeChefs {
    private CupcakeFactory cupcakeFactory; //returns a concrete cupcake

    public CupcakeChefs(CupcakeFactory cupcakeFactory) {
        this.cupcakeFactory = cupcakeFactory;
    }

   public void giveCommandToChef(String type, String frosting, int temperature, int time) {
        Cupcake cupcake = cupcakeFactory.createCupcake(type, frosting, temperature, time);
        cupcake.bake(type, frosting, temperature, time);
    }
}

