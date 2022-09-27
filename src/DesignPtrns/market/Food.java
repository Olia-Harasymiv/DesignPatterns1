package DesignPtrns.market;

import DesignPtrns.colors.Color;

public abstract class Food {

    protected Color color;

    public Food(Color color){
        this.color=color;
    }

    abstract public void applyColor();
}
