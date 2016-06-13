import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log4jMultiThreadin implements Runnable 
{	
	//Logger logger = LogManager.getRootLogger();
	Logger logger = LogManager.getLogger(Log4jMultiThreadin.class);
	//logger.error(arg0);
	String id="id1";
	String symbol="@";
	
	Thread thrd=null;
	public void run() 
	{
		try {// TODO Auto-generated method stub
			
		//logger.fatal("Processing trade with id: {} and symbol : {} ", id, symbol);
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
        Log4jMultiThreadin log1=new Log4jMultiThreadin();
        Log4jMultiThreadin log2=new Log4jMultiThreadin();
        // Log4jMultiThreadin log3=new Log4jMultiThreadin();
        
        log1.start();
        //log1.thrd.join();
        log2.start();
       // log3.start();
    	//logger.fatal("Fatal Message!");
    }


	
}
