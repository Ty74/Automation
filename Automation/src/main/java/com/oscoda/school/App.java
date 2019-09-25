package com.oscoda.school;


import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App extends OscodaSchoolInitialization
{
    public static void main( String[] args )
    {
        OscodaSchoolInitialization school = new OscodaSchoolInitialization();
        school.OscodaSchoolInitializationSetup();
    	ChromeDriver chromeDriver = new ChromeDriver();
    	chromeDriver.get("http://oscodaschools.org/cms/One.aspx?portalId=530738&pageId=530746");
    	//String console ="C:\\Users\\troyt\\Desktop\\project\\school\\src\\test\\resources\\Console.properties";
    	//PropertyConfigurator.configure(console);
    	String log4jConfPath = "C:\\Users\\troyt\\Desktop\\project\\school\\src\\test\\resources\\log4j.properties";
    	PropertyConfigurator.configure(log4jConfPath);
    	BoardOfEducationTest getBOETests = new BoardOfEducationImpl();
    	getBOETests.testBoardOfEducationLink(chromeDriver);
    	getBOETests.testBoardPolicyLink(chromeDriver);
    	getBOETests.testCommunityEducationLink(chromeDriver);
    	getBOETests.testHREmploymentOpportunitiesLink(chromeDriver);
    	getBOETests.testEmergencyDrillsLink(chromeDriver);
    	getBOETests.testAnnualReportsLink(chromeDriver);
    	getBOETests.testSchoolObserverLink(chromeDriver);
    	getBOETests.testStrategicPlanLink(chromeDriver);
    	getBOETests.testMeetingsAgendasLink(chromeDriver);
    	chromeDriver.get("file:///C:/Users/troyt/Desktop/project/school/src/test/resources/log4j.html");
    	
    }
}
