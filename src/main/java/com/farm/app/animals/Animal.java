package com.farm.app.animals;

import java.util.Random;

/**
 * Created by slawekskel on 9/21/16.
 */
public class Animal {

    private final Sex sex;

    private float weightInGram = 1f;
    private float dailyWaightGainGram;

    private Integer ageInDays =0;

    private Integer dayOfGrowht;
    private float multiplicationGain;

    public Animal() {

        final int sexDecider01 = new Random().ints(0,2).findAny().getAsInt();
        if(sexDecider01 == 1){
            this.sex = Sex.MALE;
        }else{
            this.sex = Sex.FEMALE;
        }

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

    public float getMultiplicationGain() {
        return multiplicationGain;
    }

    public float getWeightInGram() {
        return weightInGram;
    }

    public void setWeightInGram(float weightInGram) {
        this.weightInGram = weightInGram;
    }

    public void setMultiplicationGain(float multiplicationGain) {
        this.multiplicationGain = multiplicationGain;
    }

    public float getDailyWaightGainGram() {
        return dailyWaightGainGram;
    }

    public void setDailyWaightGainGram(float dailyWaightGainGram) {
        this.dailyWaightGainGram = dailyWaightGainGram;
    }

}
