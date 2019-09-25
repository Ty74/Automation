/**
 * 
 */
package com.oscoda.school;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author troyt
 *
 */
public class OscodaSchoolInitialization {
	//ChromeDriver chromeDriver = new ChromeDriver();
	
	public String OscodaSchoolInitializationSetup() {
		return System.setProperty("webdriver.chrome.driver", "C:\\Users\\troyt\\Desktop\\project\\SeleniumHq jars and executables\\Chrome Driver\\chromedriver_win32\\chromedriver.exe"); 
		
	}

}
