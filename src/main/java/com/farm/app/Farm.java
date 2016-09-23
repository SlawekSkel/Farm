package com.farm.app;

//Singleton
public class Farm {

    private Farm(){}

    private Inventory inventory;


    private static Farm farm = null;

    public static Farm getInstance(){

        if(farm == null){

            farm = new Farm();
        }
        return farm;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
