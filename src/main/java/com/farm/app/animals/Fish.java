package com.farm.app.animals;

/**
 * Created by slawekskel on 9/21/16.
 */
public class Fish extends Animal{


    public Fish() {
        super();
        setDayOfGrowht(9);
        setGain(0.3f);
    }

    @Override
    public String toString() {
        return "Fish{" +
                "sex=" + this.getSex() +
                '}';
    }


}
