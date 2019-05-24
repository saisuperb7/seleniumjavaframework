package seleniumjavaframework;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	
	private static Logger logger = LogManager.getLogger(Log4jDemo.class) ;
	
	public static void main(String[] args) {
		
		System.out.println("hello world");
		
		logger.info("this is info");
		logger.error("this is error");
		logger.fatal("this is fatal");
		logger.warn("this is warn");
		
		System.out.println("Done");
	}
}
