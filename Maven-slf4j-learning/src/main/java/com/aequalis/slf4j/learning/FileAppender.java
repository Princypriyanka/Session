package com.aequalis.slf4j.learning;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.spi.LoggerFactoryBinder;

public class FileAppender {
	 public static void main(String[] args) {
         Logger logger = LoggerFactory.getLogger(FileAppender.class);
        		 

         for(int i=0; i<10; i++) {
             logger.debug("This is debug..");
             try {
                 Thread.sleep(new Random().nextInt(1000));
             } catch (InterruptedException e) {
                 logger.error("Error sleeping", e);
             }
             logger.info("This is debug..");
         }

     }
}
