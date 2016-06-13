package com.aequalis.log4_learning;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class FileAppender implements Runnable 
{	
	Logger logger =  LogManager.getLogger(FileAppender.class);
	//logger.error(arg0);
	Thread thrd=null;
	public void run() 
	{
		try {// TODO Auto-generated method stub
		logger.fatal("Fatal Message ");
			Thread.sleep(1000);
		logger.trace("Trace Message!");
			Thread.sleep(1000);
		logger.debug("Debug Message!");
		  Thread.sleep(1000);
		logger.info("Info Message!");
			Thread.sleep(1000);
		logger.warn("Warn Message!");
			Thread.sleep(1000);
			
		logger.error("Error Message!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
	}
	public void start()
	{
		thrd=new Thread(this);
		thrd.start();
	}
	

    public static void main( String[] args ) throws InterruptedException{
        FileAppender log1=new FileAppender();
        FileAppender log2=new FileAppender();
        
       // Log4jMultiThreadin log3=new Log4jMultiThreadin();
        
        log1.start();
        //log1.thrd.join();
        log2.start();
       // log3.start();
    	//logger.fatal("Fatal Message!");
    }


	
}
