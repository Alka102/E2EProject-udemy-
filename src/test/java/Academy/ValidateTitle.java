package Academy;

import java.io.IOException;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.BaseTest;



public class ValidateTitle extends BaseTest {

//public static Logger log=LogManager.getLogger(BaseTest.class.getName());	
	
@BeforeTest
public void initialize() throws IOException
{
	driver=initializeDriver();
	//Log.info("Driver is initialized");
	driver.get(prop.getProperty("url"));
	//Log.info("Navigation to Home page");
}
	
@Test
public void basePageNavigation() throws IOException
{
	driver=initializeDriver();
	//driver.get("http://qaclickacademy.com/");
	driver.get(prop.getProperty("url"));
	LandingPage l=new LandingPage(driver);

	Assert.assertEquals(l.getTitle().getText(),"FEATURED COURSES");
	//Log.info("Successfully validated Text message");
	
	
}


@AfterTest
public void tearDown()
{
	driver.close();
}	
	
	
	
}




