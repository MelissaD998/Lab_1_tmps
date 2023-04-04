package factoryMethod.product;

public abstract class Cupcake { //defines common methods for all concrete products
    public void bake(String type, String frosting, int temperature, int time) {
        System.out.println("Baking the " + getType(type) + " cupcake");
        System.out.println("Adding " + getFrosting(frosting) + " frosting");
        System.out.println("Baking at " + getTemperature(temperature) + " degrees for " + getTime(time) + " minutes");
    }

    public abstract String getType(String type);

    public abstract String getFrosting(String frosting);

    public abstract int getTemperature(int temperature);

    public abstract int getTime(int time);
}
