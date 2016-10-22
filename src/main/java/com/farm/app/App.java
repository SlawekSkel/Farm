package com.farm.app;

import com.farm.app.machines.JDeereTractor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.TimeUnit;

public class App
{
    private static final Logger LOGGER = LogManager.getLogger(App.class);
    private static final int DAY_INTERVAL = 1;
    private static final Farm KowalskiFarm = Farm.getInstance();

    public static void main(String[] args) throws InterruptedException {


        JDeereTractor jDeereTractor = new JDeereTractor();
        jDeereTractor.tank(500f);

        LOGGER.info("Wellcome on our farm");

        LOGGER.info("Initiation of KowalskiFarm farm");
        Inventory inventory = new Inventory();
        inventory.initiateNumberOfFish(15);
        inventory.initiateNumberOfSheeps(8);

        KowalskiFarm.setInventory(inventory);
        KowalskiFactory kowalskiFactory = new KowalskiFactory();
        Vegetator vegetator = new Vegetator();
        InventoryScale inventoryScale = new InventoryScale();


        LOGGER.info("Evolving cycle");
        int DAY_COUNTER = 1;
        while(DAY_COUNTER <= 130) {

            kowalskiFactory.born(KowalskiFarm.getInventory());
            vegetator.vegetate(KowalskiFarm.getInventory());
            inventoryScale.masure(KowalskiFarm.getInventory(),DAY_COUNTER);

            jDeereTractor.work(40);


            TimeUnit.SECONDS.sleep(DAY_INTERVAL);
            DAY_COUNTER +=DAY_INTERVAL;

//            if(DAY_COUNTER == 100){
//
//                TimeUnit.SECONDS.sleep(DAY_INTERVAL);
//
//            }

        }


    }

}
