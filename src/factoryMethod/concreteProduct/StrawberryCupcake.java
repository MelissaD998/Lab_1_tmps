package factoryMethod.concreteProduct;

import factoryMethod.product.Cupcake;

public class StrawberryCupcake extends Cupcake {
    private String type;
    private String frosting;
    private int temperature;
    private int time;

    public StrawberryCupcake(String type, String frosting, int temperature, int time) {
        this.type = type;
        this.frosting = frosting;
        this.temperature = temperature;
        this.time = time;
    }

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
