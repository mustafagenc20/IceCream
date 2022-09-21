package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamCar implements IceCreamSeller {
    private PriceList priceList;
    private Stock stock;
    private double profit;


    public Cone prepareCone(Cone.Flavor[] flavor){

    }

    public IceRocket prepareRocket(){

    }

    public Magnum prepareMagnum(Magnum.MagnumType magnumType){

    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavor) {
        return null;
    }

    @Override
    public IceRocket orderIceRocket() {
        return null;
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumType) {
        return null;
    }

    public double getProfit(){
        return profit;
    }
}
