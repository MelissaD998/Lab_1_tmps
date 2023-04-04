package abstractFactory.concreteFactory;

import abstractFactory.abstractFactory.CakeFactory;
import abstractFactory.abstractProduct.Cake;
import abstractFactory.concreteProduct.StrawberryCake;

public class StrawberryCakeFactory implements CakeFactory {
    public Cake createCake(){
        return new StrawberryCake();
    }
}
