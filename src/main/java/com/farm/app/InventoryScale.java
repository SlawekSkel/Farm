package com.farm.app;

import com.farm.app.animals.Fish;
import com.farm.app.animals.Sheep;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by slawekskel on 9/23/16.
 */
public class InventoryScale {

    private static final Logger LOGGER = LogManager.getLogger(InventoryScale.class);



    public void masure(Inventory inventory, int DAY_COUNTER) {

        float newMassKG = 0;

        for (Fish fish:inventory.getFishes()) {
            newMassKG += fish.getWeightInGram()/1000;
        }
        inventory.setFishesWeightInKG(newMassKG);

        newMassKG = 0;
        for (Sheep sheep:inventory.getSheeps()) {
            newMassKG += sheep.getWeightInGram()/1000;
        }
        inventory.setSheepsWeightInKG(newMassKG);

        LOGGER.info("DAY {} | Mass of {} sheeps: {} kg, mass of {} fishes: {} kg", DAY_COUNTER,
                inventory.sheeps.size(),
                inventory.getSheepsWeightInKG(),
                inventory.fishes.size(),
                inventory.getFishesWeightInKG());

    }
}
