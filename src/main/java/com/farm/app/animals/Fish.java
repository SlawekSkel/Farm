package com.farm.app.animals;

/**
 * Created by slawekskel on 9/21/16.
 */
public class Fish extends Animal{


    public Fish() {
        super();
        setDayOfGrowht(9);
        setMultiplicationGain(0.3f);
        setWeightInGram(1);
        setDailyWaightGainGram(0.7f);

    }

    @Override
    public String toString() {
        return "Fish{" +
                "sex=" + this.getSex() +
                '}';
    }


}
