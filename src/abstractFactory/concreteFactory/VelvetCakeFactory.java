package abstractFactory.concreteFactory;


import abstractFactory.abstractProduct.Cake;
import abstractFactory.abstractFactory.CakeFactory;
import abstractFactory.concreteProduct.VelvetCake;

public class VelvetCakeFactory implements CakeFactory {
    @Override
    public Cake createCake() {
        return new VelvetCake();
    }
}

