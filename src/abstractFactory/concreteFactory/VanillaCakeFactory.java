package abstractFactory.concreteFactory;

import abstractFactory.abstractProduct.Cake;
import abstractFactory.abstractFactory.CakeFactory;
import abstractFactory.concreteProduct.VanillaCake;

public class VanillaCakeFactory implements CakeFactory {
    @Override
    public Cake createCake() {
        return new VanillaCake();
    }
}