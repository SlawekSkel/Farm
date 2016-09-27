package com.farm.app.animals;

/**
 * Created by slawekskel on 9/21/16.
 */
public class Sheep extends Mammal {

    public Sheep() {
        super();
        setDayOfGrowht(90);
        setMultiplicationGain(0.7f);
        setWeightInGram(5000);
        setDailyWaightGainGram(250);

    }

    @Override
    public String toString() {
        return "Sheep{" +
                "sex=" + this.getSex() +
                '}';
    }


}
