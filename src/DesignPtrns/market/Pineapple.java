package DesignPtrns.market;

import DesignPtrns.colors.Color;

public class Pineapple extends Food {

    public Pineapple(Color color){
        super(color);
    }
    @Override
    public void applyColor() {
        System.out.println("If pineapple is fresh and ripe, its color is ");
        color.applyColor();
    }
}
