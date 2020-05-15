package Academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import Resources.BaseTest;



public class ValidateNavigationBar extends BaseTest {

@BeforeTest
public void initialize() throws IOException
{
	driver=initializeDriver();
	driver.get(prop.getProperty("url"));		
}



@Test
public void basePageNavigation() throws IOException
{
	
	LandingPage l=new LandingPage(driver);
    Assert.assertTrue(l.getNavigationBar().isDisplayed());
	//Assert.assertFalse(false);
}



@AfterTest
public void tearDown()
{
	driver.close();
}
	
}
	





