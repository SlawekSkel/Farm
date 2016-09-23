package com.farm.app;

import com.farm.app.animals.Fish;
import com.farm.app.animals.Sheep;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by slawekskel on 9/22/16.
 */
public class Inventory {

    public Inventory() {
    }

    List<Sheep> sheeps = new ArrayList<Sheep>();
    List<Fish> fishes = new ArrayList<Fish>();

    public List<Sheep> getSheeps() {
        return sheeps;
    }

    public void setSheeps(Sheep sheep) {
        this.sheeps.add(sheep);
    }

    public List<Fish> getFishes() {
        return fishes;
    }

    public void setFishes(Fish fish) {
        this.fishes.add(fish);
    }

    public void initiateNumberOfSheeps(Integer numberOfSheeps) {

        this.sheeps.clear();
        for (int i = 0; i < numberOfSheeps; i++) {
            this.sheeps.add(new Sheep());
        }

    }

    public void initiateNumberOfFish(Integer numberOfFish) {
        this.fishes.clear();
        for (int i = 0; i < numberOfFish; i++) {

            this.fishes.add(new Fish());
        }
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "sheeps=" + sheeps +
                ", fishes=" + fishes +
                ", numberOfSheeps=" + sheeps.size() +
                ", numberOfFish=" + fishes.size() +
                '}';
    }
}
