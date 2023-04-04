package factoryMethod.concreteProduct;

import factoryMethod.product.Cupcake;

public class ChocolateCupcake extends Cupcake {  // concrete product class
    private String type;
    private String frosting;
    private int temperature;
    private int time;
    //concrete implementation of the Cupcake abstract class, and it represents a specific type of cupcake
    public ChocolateCupcake(String type, String frosting, int temperature, int time) {
        this.type = type;
        this.frosting = frosting;
        this.temperature = temperature;
        this.time = time;
    }
//from cupcake
    @Override
    public String getType(String type) {
        this.type = type;
        return type;
    }

    @Override
    public String getFrosting(String frosting) {
        this.frosting = frosting;
        return frosting;
    }

    @Override
    public int getTemperature(int temperature) {
        this.temperature = temperature;
        return temperature;
    }

    @Override
    public int getTime(int time) {
        this.time = time;
        return time;
    }
}
