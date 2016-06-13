package com.aequalis.slf4j.learning;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger logger = LoggerFactory.getLogger(App.class);
	
    public static void main(String[] args) 
    {
    	String id="id1";
    	String symbol="@";
    	
    	for(int i=0; i<10; i++) {
            logger.debug("This is debug..");
            try {
                Thread.sleep(new Random().nextInt(1000));
            } catch (InterruptedException e) {
                logger.error("Error sleeping", e);
            }
            logger.info("simple logging ");
        }
        logger.debug("Processing trade with id: {} and symbol : {} ", id, symbol);
    }
}
