package com.farm.app.animals;

import java.util.Random;

/**
 * Created by slawekskel on 9/21/16.
 */
public class Animal {

    private float weightInGram = 1f;
    private Integer ageInDays =1;
    private Sex sex;
    private Integer dayOfGrowht;
    private float gain;

    public Animal() {

        final int sexDecider01 = new Random().ints(0,2).findAny().getAsInt();
        if(sexDecider01 == 1){
            this.sex = Sex.MALE;
        }else{
            this.sex = Sex.FEMALE;
        }

    }

    public float getWeight() {
        return weightInGram;
    }

    public void setWeight(float weight) {
        this.weightInGram = weight;
    }

    public Integer getAgeInDays() {
        return ageInDays;
    }

    public void setAgeInDays(Integer ageInDays) {
        this.ageInDays = ageInDays;
    }

    public Sex getSex() {
        return sex;
    }

    public Integer getDayOfGrowht() {
        return dayOfGrowht;
    }

    public void setDayOfGrowht(Integer dayOfGrowht) {
        this.dayOfGrowht = dayOfGrowht;
    }

    public float getGain() {
        return gain;
    }

    public void setGain(float gain) {
        this.gain = gain;
    }
}
