package com.farm.app;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Created by slawekskel on 9/20/16.
 */
public class SingletonTest extends TestCase {

    private final static Logger logger = LogManager.getLogger(SingletonTest.class);

    private ClassicSingleton sone = null, stwo = null;


    public SingletonTest(String name) {
        super(name);
    }
    public void setUp() {
        logger.info("getting singleton...");
        sone = ClassicSingleton.getInstance();
        logger.info("...got singleton: " + sone);
        logger.info("getting singleton...");
        stwo = ClassicSingleton.getInstance();
        logger.info("...got singleton: " + stwo);
    }
    public void testUnique() {
        logger.info("checking singletons for equality");
        Assert.assertEquals(true, sone == stwo);
    }
}
