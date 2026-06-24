package Microsoft.teams;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App 
{
	// Enabling logging for the App class
	static final Logger logger=LoggerFactory.getLogger(App.class);

    public static void main( String[] args )
    {
    	System.out.println("Hello World ");
    	
    	// Different Logging Variants
    	logger.info("This is INFO");
    	logger.warn("This is Warning");
    	logger.debug("This is Debug");
    	logger.error("This is Error");
    	

    }
}
