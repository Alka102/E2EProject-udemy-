package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
public  WebDriver driver;
public  Properties prop;
public WebDriver initializeDriver() throws IOException
{
	 prop=new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\arvind\\E2EProject\\src\\main\\java\\Resources\\data.properties ");
	
	prop.load(fis);
    String browsername=prop.getProperty("browser");
	System.out.println(browsername);   
    
    if(browsername.equals("chrome"))
    {
    	System.setProperty("webdriver.chrome.driver","./driver\\chromedriver.exe");
    	 driver=new ChromeDriver();
    }
    
    else if(browsername.equals("firefox"))
    {
    	System.setProperty("webdriver.gecko.driver","./driver\\geckodriver.exe");
    	driver=new FirefoxDriver();
    	
    }
    
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    return driver;
}
public void getScreenshot(String result) throws IOException
{
File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src, new File("C://test//"+result+"screenshot.png"));

}

}

    	
    	
    	
    
    	
	



