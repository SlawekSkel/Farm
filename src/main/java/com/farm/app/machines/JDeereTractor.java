package com.farm.app.machines;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by slawekskel on 10/4/16.
 */
public class JDeereTractor implements Tractor{

    private static final Logger LOGGER = LogManager.getLogger(JDeereTractor.class);

    public JDeereTractor() {
        fuelLevelIn_L = 0;
    }

    protected static final float tankVolumeIn_L = 70f;
    protected static final float vMax_KM_h = 30f;

    public static final float fuelConsumptionIn_L_100KM = 0.08f;

    private float fuelLevelIn_L;

    @Override
    public void work(float workDistanceIn_KM) {

        if(fuelLevelIn_L < fuelConsumptionIn_L_100KM * workDistanceIn_KM)
        {
            this.fuelLevelIn_L = 0f;
            LOGGER.error("THERE IS NO FUEL !!!");
        }else {
            this.fuelLevelIn_L -= fuelConsumptionIn_L_100KM * workDistanceIn_KM;
            LOGGER.trace("Fuel level: {} L", fuelLevelIn_L);
        }
    }

    @Override
    public void tank(float petrolIn_L) {


        if(fuelLevelIn_L + petrolIn_L < tankVolumeIn_L) {
            this.fuelLevelIn_L += petrolIn_L;
        } else {
            LOGGER.error("THE TANK HAS MAX {} L VOLUME", tankVolumeIn_L);
            this.fuelLevelIn_L = tankVolumeIn_L;

        }
    }
}
