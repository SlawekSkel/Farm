package com.farm.app;

import com.farm.app.animals.Fish;
import com.farm.app.animals.Sheep;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by slawekskel on 9/22/16.
 */
public class KowalskiFactory implements BornFactory{

    static int fishCounter = 0;
    static int sheepCounter = 0;

    private static final Logger LOGGER = LogManager.getLogger(KowalskiFactory.class);

    public void born(Inventory inventory){

        fishGrowth(inventory);
        sheepGrowth(inventory);

    }

    private void fishGrowth(Inventory inventory) {

        fishCounter++;
        if(fishCounter == inventory.getFishes().get(0).getDayOfGrowht()){

            int increase = (int)(inventory.fishes.size()*inventory.fishes.get(0).getMultiplicationGain());
            for (int i=0;i<increase; i++){

                inventory.getFishes().add(new Fish());
            }
            LOGGER.trace("The birth of {} fishes, Total: {} ", increase, inventory.fishes.size());
            fishCounter = 0;
        }
    }

    private void sheepGrowth(Inventory inventory) {

        sheepCounter++;
        if(sheepCounter == inventory.getSheeps().get(0).getDayOfGrowht()){

            int increase = (int)(inventory.sheeps.size()*inventory.sheeps.get(0).getMultiplicationGain());
            for (int i=0;i<increase; i++){

                inventory.getSheeps().add(new Sheep());
            }
            LOGGER.trace("The birth of {} sheeps, Total: {} ", increase, inventory.sheeps.size());
            sheepCounter = 0;
        }
    }

}
