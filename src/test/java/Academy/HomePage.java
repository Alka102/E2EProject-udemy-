package Academy;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.BaseTest;

public class HomePage extends BaseTest {

@BeforeTest
public void initialize() throws IOException
{
	driver=initializeDriver();
	
}


@Test(dataProvider="getData")
public void basePageNavigation(String Username,String Password,String text) throws IOException
{
	//driver=initializeDriver();
	//driver.get("https://www.facebook.com/");
	//driver.get("http://qaclickacademy.com/");
	driver.get(prop.getProperty("url"));	
	LandingPage l=new LandingPage(driver);
	l.getLogin().click();
	LoginPage lp=new LoginPage(driver);
	lp.getEmail().sendKeys(Username);
	lp.getPassword().sendKeys(Password);
	System.out.println(text);
	lp.getLogin().click();	
	
}
@DataProvider
public Object[][] getData()
{
	Object[][] data=new Object[2][3];
	
	data[0][0]="nonrestricteduser@qw.com";
	data[0][1]="123456";
	data[0][2]="Restricted User";
	
	
 	data[1][0]="restricteduser@qw.com";
	data[1][1]="123456";
	data[1][2]="NonRestricted User"; 
	
	return data;
}	

@AfterTest
public void tearDown()
{
	driver.close();
}	
	
	
	
	
}





