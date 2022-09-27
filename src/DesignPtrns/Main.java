package DesignPtrns;

import DesignPtrns.colors.Brown;
import DesignPtrns.market.Pineapple;
import DesignPtrns.market.Food;


public class Main {
    public static void main(String[] args) {


        Food pineapple = new Pineapple(new Brown());
        pineapple.applyColor();
    }
}
