package abstractFactory.concreteFactory;


import abstractFactory.abstractProduct.Cake;
import abstractFactory.abstractFactory.CakeFactory;
import abstractFactory.concreteProduct.ChocolateCake;

public class ChocolateCakeFactory implements CakeFactory { //concrete factory
    @Override
    public Cake createCake() {
        return new ChocolateCake();
    }
}
