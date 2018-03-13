package dev.console;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.service.AppService;	

public class App {

	public static final Logger LOGGER = LoggerFactory.getLogger(App.class);
		
	public static void main(String[] args) {
		LOGGER.info("Bonjour sdsdf");	
		LOGGER.info("Imskdfsdf");
		new AppService().executer("valeur 1");
	}

}
