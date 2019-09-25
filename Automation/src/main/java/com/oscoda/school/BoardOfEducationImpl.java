/**
 * 
 */
package com.oscoda.school;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
import org.apache.log4j.Logger;
/**
 * @author troyt
 *
 */
public class BoardOfEducationImpl extends OscodaSchoolInitialization implements BoardOfEducationTest {

	
	static Logger LOGGER = Logger.getLogger(BoardOfEducationImpl.class);
	
	
	
	public void testBoardOfEducationLink(ChromeDriver chromeDriver) {
		
		       //Create new web element locating the element that you want to obtain
				WebElement locate_Board_Of_Education =  chromeDriver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_ctl01_radmenu\"]/ul/li[2]/a"));
				// Get text
				String expected = locate_Board_Of_Education.getText();
				// click on the element
				locate_Board_Of_Education.click();
				// Locate the element to compare 
			    WebElement second_locate_Board_Of_Education = chromeDriver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/h2"));
				// get text 
			    String actual = second_locate_Board_Of_Education.getText();
			   
				//if true then use logger to print pass or fail to the html
			    if(expected.equalsIgnoreCase(actual)) {
			        LOGGER.info("Pass");
			    }else {
			    	LOGGER.error("Fail");
			    }
		
		
		
	}
	
	public void testBoardPolicyLink(ChromeDriver chromeDriver) {
		
		//locate link
		WebElement locate_test_Board_Policy =  chromeDriver.findElement(By.xpath("//*[@id=\"inside-nav\"]/div[2]/div[2]/a"));
		// Get text
		String expected = locate_test_Board_Policy.getText();
		// click on the element
		locate_test_Board_Policy.click();
		//wait for userinterface to render
		WebDriverWait wait = new WebDriverWait(chromeDriver, 20);
		//open different url
		chromeDriver.get("https://go.boarddocs.com/mi/oscoda/Board.nsf/Public?open&id=policies");
		// Locate the element to compare and wait for element to render
	    WebElement second_locate_test_Board_Policy= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"SiteTitle1\"]")));
		// get text 
	    String actual = second_locate_test_Board_Policy.getText();
	   
		//if true then use logger to print pass or fail to the html
	    if(actual.contains(expected)) {
	        LOGGER.info("Pass");
	    }else {
	    	LOGGER.error("Fail");
	    }
		
	}
	
	public void testCommunityEducationLink(ChromeDriver chromeDriver) {
		
		chromeDriver.get("http://oscodaschools.org/cms/One.aspx?portalId=530738&pageId=675213");
		//Create new web element locating the element that you want to obtain
		WebElement locate_Community_Education =  chromeDriver.findElement(By.xpath("//*[@id=\"inside-nav\"]/div[2]/div[3]/a"));
		// Get text
		String expected = locate_Community_Education.getText();
		// click on the element
		locate_Community_Education.click();
		// Locate the element to compare 
	    WebElement second_locate_Community_Education = chromeDriver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/h2"));
		// get text 
	    String actual = second_locate_Community_Education.getText();
	   
		//if true then use logger to print pass or fail to the html
	    if(expected.equalsIgnoreCase(actual)) {
	        LOGGER.info("Pass");
	    }else {
	    	LOGGER.error("Fail");
	    }
		
	}
	
	public void testHREmploymentOpportunitiesLink(ChromeDriver chromeDriver) {
		        //Create new web element locating the element that you want to obtain
				WebElement locate_HR_Employment_Opportunities =  chromeDriver.findElement(By.xpath("//*[@id=\"inside-nav\"]/div[2]/div[4]/a"));
				// Get text
				String expected = locate_HR_Employment_Opportunities.getText();
				// click on the element
				locate_HR_Employment_Opportunities.click();
				// Locate the element to compare 
			    WebElement second_locate_HR_Employment_Opportunities = chromeDriver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/h2"));
				// get text 
			    String actual = second_locate_HR_Employment_Opportunities.getText();
			   
				//if true then use logger to print pass or fail to the html
			    if(expected.equalsIgnoreCase(actual)) {
			        LOGGER.info("Pass");
			    }else {
			    	LOGGER.error("Fail");
			    }
		
	}
	
	public void testMeetingsAgendasLink(ChromeDriver chromeDriver) {
		 //Create new web element locating the element that you want to obtain
		WebElement locate_Meeting_Agendas =  chromeDriver.findElement(By.xpath("//*[@id=\"inside-nav\"]/div[2]/div[5]/a"));
		// Get text
		String expected = locate_Meeting_Agendas.getText();
		// click on the element
		locate_Meeting_Agendas.click();
		// Locate the element to compare 
	    WebElement second_locate_Meeting_Agendas = chromeDriver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/h2"));
		// get text 
	    String actual = second_locate_Meeting_Agendas.getText();
	   
		//if true then use logger to print pass or fail to the html
	    if(expected.equalsIgnoreCase(actual)) {
	        LOGGER.info("Pass");
	    }else {
	    	LOGGER.error("Fail");
	    }
		
	}
	public void testEmergencyDrillsLink(ChromeDriver chromeDriver) {
		 //Create new web element locating the element that you want to obtain
		WebElement locate_Emergency_Drills =  chromeDriver.findElement(By.xpath("//*[@id=\"inside-nav\"]/div[2]/div[6]/a"));
		// Get text
		String expected = locate_Emergency_Drills.getText();
		// click on the element
		locate_Emergency_Drills.click();
		// Locate the element to compare 
	    WebElement second_locate_Emergency_Drills = chromeDriver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]"));
		// get text 
	    String actual = second_locate_Emergency_Drills.getText();
	   
		//if true then use logger to print pass or fail to the html
	    if(expected.equalsIgnoreCase(actual)) {
	        LOGGER.info("Pass");
	    }else {
	    	LOGGER.error("Fail");
	    }
		
	}
	public void testAnnualReportsLink(ChromeDriver chromeDriver) {
		 //Create new web element locating the element that you want to obtain
		WebElement locate_Annual_Reports =  chromeDriver.findElement(By.xpath("//*[@id=\"inside-nav\"]/div[2]/div[7]/a"));
		// Get text
		String expected = locate_Annual_Reports.getText();
		// click on the element
		locate_Annual_Reports.click();
		// Locate the element to compare 
	    WebElement second_locate_Annual_Reports = chromeDriver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/h2"));
		// get text 
	    String actual = second_locate_Annual_Reports.getText();
	   
		//if true then use logger to print pass or fail to the html
	    if(expected.equalsIgnoreCase(actual)) {
	        LOGGER.info("Pass");
	    }else {
	    	LOGGER.error("Fail");
	    }
		
	}
	public void testSchoolObserverLink(ChromeDriver chromeDriver) {
		 //Create new web element locating the element that you want to obtain
		WebElement locate_HR_Employment_Opportunities =  chromeDriver.findElement(By.xpath("//*[@id=\"inside-nav\"]/div[2]/div[8]/a"));
		// Get text
		String expected = locate_HR_Employment_Opportunities.getText();
		// click on the element
		locate_HR_Employment_Opportunities.click();
		// Locate the element to compare 
	    WebElement second_locate_HR_Employment_Opportunities = chromeDriver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/h2"));
		// get text 
	    String actual = second_locate_HR_Employment_Opportunities.getText();
	   
		//if true then use logger to print pass or fail to the html
	    if(expected.equalsIgnoreCase(actual)) {
	        LOGGER.info("Pass");
	    }else {
	    	LOGGER.error("Fail");
	    }
		
	}
	public void testStrategicPlanLink(ChromeDriver chromeDriver) {
		 //Create new web element locating the element that you want to obtain
		WebElement locate_HR_Employment_Opportunities =  chromeDriver.findElement(By.xpath("//*[@id=\"inside-nav\"]/div[2]/div[9]/a"));
		// Get text
		String expected = locate_HR_Employment_Opportunities.getText();
		// click on the element
		locate_HR_Employment_Opportunities.click();
		// Locate the element to compare 
	    WebElement second_locate_HR_Employment_Opportunities = chromeDriver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div[2]/h2"));
		// get text 
	    String actual = second_locate_HR_Employment_Opportunities.getText();
	   
		//if true then use logger to print pass or fail to the html
	    if(expected.equalsIgnoreCase(actual)) {
	        LOGGER.info("Pass");
	    }else {
	    	LOGGER.error("Fail");
	    }
		
	}

}
