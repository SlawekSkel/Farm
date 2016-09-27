package com.farm.app;

import com.farm.app.animals.Fish;
import com.farm.app.animals.Sheep;

/**
 * Created by slawekskel on 9/23/16.
 */
public class Vegetator {

    public Vegetator() {
    }

    public void vegetate(Inventory inventory){


        for (Fish fish:inventory.getFishes()) {

            fish.setAgeInDays( fish.getAgeInDays() +1 );
            fish.setWeightInGram(fish.getWeightInGram() + fish.getDailyWaightGainGram());
        }

        for (Sheep sheep:inventory.getSheeps()) {

            sheep.setAgeInDays( sheep.getAgeInDays() +1 );
            sheep.setWeightInGram(sheep.getWeightInGram() + sheep.getDailyWaightGainGram());
        }


    }
}
