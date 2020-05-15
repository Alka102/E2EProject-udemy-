package Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

public WebDriver driver;

By signin=By.xpath("//a[@href='http://qaclickacademy.usefedora.com/sign_in'] ");
By title=By.xpath("//h2[text()='Featured Courses']");
By ntitle=By.xpath("//ul[@class='nav navbar-nav navbar-right'] ");

public LandingPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}


public WebElement getLogin()
{
	return driver.findElement(signin);
	

}






public WebElement getNavigationBar() {
	// TODO Auto-generated method stub
	return driver.findElement(ntitle);
}





 



public WebElement getTitle() {
	
	return driver.findElement(title);
}  



}